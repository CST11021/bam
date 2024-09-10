package cn.gov.zcy.paas.dto.page;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhouzongkun on 2018/10/15.
 */
@Data
@AllArgsConstructor
public class PageRO<T> implements Serializable {
    private static final long serialVersionUID = -6791031288112518211L;

    /** 总记录数*/
    private Long total;
    /** 结果集*/
    private List<T> data;
    private int pageNum;
    private int pageSize;
    /** 总页数*/
    private int pages;
    /** 第几页*/
    private int size;

    public PageRO() {
    }

    public PageRO(Long total, List<T> data) {
        this.data = data;
        this.total = total;
    }

    public static <T> PageRO<T> empty() {
        return new PageRO();
    }


    /**
     * 类型转换
     * @param source 源集合
     * @return
     */
    public <S extends Serializable> PageRO<S> transLate(List<S> source)  {
        PageRO<S> pageRO = new PageRO<>();
        pageRO.setTotal(this.total);
        pageRO.setData(source);
        pageRO.setPageNum(this.pageNum);
        pageRO.setPageSize(this.pageSize);
        pageRO.setPages(this.pages);
        pageRO.setSize(this.size);
        return pageRO;
    }

}
