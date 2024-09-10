class LayerHelper {

    static alert() {

    }

    static confirm() {

    }

    static msg() {

    }

    static page() {

    }

    static iframe(title, url, area) {
        layer.open({
            type: 2,
            title: title,
            shadeClose: true,
            maxmin: true, //开启最大化最小化按钮
            area: area,
            content: url
        });
    }

    static load() {

    }

    static tips() {

    }

    /**
     * 弹出输入框
     * 参见：https://layui.dev/docs/2/layer/#prompt
     *
     * @param options
     * @param yes
     */
    static prompt(options, yes) {
        // layer.prompt({title: '输入绑定的机构ID', formType: 0}, function(content, index) {
        //
        // });
        layer.prompt(options, yes);
    }

    static defaultPrompt(title, yesCallback) {
        layer.prompt({title: title, formType: 0}, function(content, index) {
            yesCallback(content, index);
        });
    }

}