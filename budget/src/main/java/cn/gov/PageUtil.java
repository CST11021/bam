package cn.gov;

import cn.gov.zcy.paas.dto.page.PageRO;
import com.github.pagehelper.Page;
import com.github.pagehelper.page.PageMethod;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Created by 向前 on 2021/07/08 17:58 </br>
 * Description: 分页工具类 </br>
 *
 * @author <a href="mailto:chengqing@cai-inc.com">向前</a></br>
 * @since 1.0.0
 */
@Slf4j
public class PageUtil {
    private PageUtil() {

    }

    private static <T> PageRO toPageResultRO(List<T> list) {
        Page<T> page = (Page) list;
        int pageNum = page.getPageNum();
        int pageSize = page.getPageSize();
        long total = page.getTotal();
        int pages = page.getPages();
        int size = page.size();
        return new PageRO(total, page, pageNum, pageSize, pages, size);
    }


    public static <T extends Serializable> PageRO<T> doSelectPage(int pageNum, int pageSize, Callable<List<T>> callable) {
        try {
            // 设置分页参数
            PageMethod.startPage(pageNum, pageSize);
            // 业务查询
            List<T> list = callable.call();
            return toPageResultRO(list);
        } catch (Exception ex) {
            throw new RuntimeException("分页查询失败", ex);
        } finally {
            PageMethod.clearPage();
        }
    }

    public static <T extends Serializable> Long count(Callable<List<T>> callable) {
        try {
            // 设置分页参数
            PageMethod.startPage(1, 1);
            // 业务查询
            List<T> list = callable.call();
            return toPageResultRO(list).getTotal();
        } catch (Exception ex) {
            throw new RuntimeException("分页查询失败", ex);
        } finally {
            PageMethod.clearPage();
        }
    }

}
