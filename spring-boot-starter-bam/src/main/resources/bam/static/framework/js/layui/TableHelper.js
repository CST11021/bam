class TableHelper {

    static commonTableOptions() {

        return {
            // , request: request
            request: {
                pageName: 'pageNo'              // 页码的参数名称，默认：page
                , limitName: 'pageSize'         // 每页数据量的参数名，默认：limit
            }
            // , response: response
            , response: {
                statusName: 'success'           // 定义状态字段名称，默认：code
                , statusCode: true              // 定义成功的状态码，默认：0
                , msgName: 'msg'                // 定义提示字段名称，默认：msg
                , dataName: 'data'              // 数据列表的字段名称，默认：data
                , countName: 'count'            // 数据总数的字段名称，默认：count
            }
            , parseData: function (res) {       // res 即为原始返回的数据
                return {
                    "success": res.success     // 解析接口调用状态
                    , "code": res.code           // 解析接口返回的状态码
                    , "msg": res.message         // 解析提示文本
                    , "data": res.result.data    // 解析数据列表
                    , "count": res.result.total  // 解析数据长度
                };
            }
            , contentType: 'application/json'
            , page: true
            , limit: 10
            , loading: true
            , even: true //开启隔行背景
        }

    }

}