class JsonUtils {

    /**
     * const obj1 = { a: 1, b: 2 };
     * const obj2 = { b: 3, c: 4 };
     * const obj3 = Object.assign({}, obj1, obj2);
     * console.log(obj3); // { a: 1, b: 3, c: 4 }
     *
     * @param json1
     * @param json2
     * @returns {*}
     */
    static merge(obj1, obj2) {
        return Object.assign({}, obj1, obj2);
        // return json1.extend({pageName:"page",limitName:"limit"}, a.request)
    }

    /**
     * 对象转json
     *
     * @param obj
     * @returns {string}
     */
    static toJson(obj) {
        return JSON.stringify(obj);
    }

}