class AjaxUtils {

    // static post(url, param, ) {
    //     $.post("http://apollo.zlb.cai-inc.com/signin",
    //         {
    //             "username": "wanghongzhan",
    //             "password": "@Wcst11021",
    //             "login-submit": "登录"
    //         },
    //         function(data, status) {
    //
    //             console.log("Apollo登录成功: " + data + "\nStatus: " + status);
    //         });
    // }

    static defaultPost(url, param, successCallback, expenseCallback) {
        $.ajax({
            type: "POST",
            url: invoke_budget_org_forceMatchOrg,
            contentType: "application/json",
            dataType: "json",
            data: JsonUtils.toJson(param),
            success: function (response) {
                if (response == null) {
                    layer.msg("服务未响应");
                } else if (!response.success) {
                    layer.msg("服务响应异常：" + response.message);
                }

                successCallback(response.data);
            },
            error: function (thrownError) {
                expenseCallback(thrownError);
            }
        });
    }

    /**
     * ajax请求
     *
     * @param option
     */
    static ajax(option) {

        $.ajax(option);

        // $.ajax({
        //     type: "POST",
        //     url: invoke_budget_org_forceMatchOrg,
        //     contentType: "application/json",
        //     dataType: "json",
        //     data: JsonUtils.toJson({
        //         id: rowData.id,
        //         orgId: orgId
        //     }),
        //     success: function (response) {
        //         if (response == null) {
        //             layer.msg("服务未响应");
        //         } else if (!response.success) {
        //             layer.msg("服务响应异常：" + response.message);
        //         }
        //
        //         layer.msg("绑定成功！");
        //         layer.close(index);
        //     },
        //     error: function (thrownError) {
        //         layer.msg("thrownError：" + thrownError);
        //     }
        // });
    }

    /**
     *
     * @param url
     * @param param
     * @param successCallbackFunction
     * @param failedCallbackFunction
     * @param thrownCallbackFunction
     */
    static post(url, param, successCallbackFunction, failedCallbackFunction, thrownCallbackFunction) {
        var newOption = Object.assign({}, obj1);
        $.ajax();

        $.ajax({
            type: "POST",
            url: url,
            contentType: "application/json",
            dataType: "json",
            data: JsonUtils.toJson(param),
            success: function (response) {
                if (response == null) {
                    layui.msg("服务未响应");
                } else if (!response.success) {
                    layui.msg("服务响应异常：" + response.message);
                }
            },
            error: function (thrownError) {
                console.log("thrownError：" + thrownError);
            }

        });

    }

    successCallbackFunction(response) {

    }

}






