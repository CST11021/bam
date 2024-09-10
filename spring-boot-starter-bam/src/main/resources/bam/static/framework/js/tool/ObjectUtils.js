class ObjectUtils {

    /**
     * 获取对象的所有属性
     *
     * @param obj
     * @returns {string[]}
     */
    static keys(obj) {
        return Object.keys(obj);
    }

    /**
     *
     * @param obj
     * @param fieldName
     * @returns {*}
     */
    static getFieldValue(obj, fieldName) {
        return obj[fieldName]
    }

    /**
     * 移除对象中的string类型的字段的空格
     *
     * @param obj
     * @returns {*}
     */
    static trimToNull(obj) {
        Object.keys(obj).forEach((key)=> {
            var content = $.trim(obj[key]);
            if (content == '') {
                obj[key] = null;
            } else {
                obj[key] = content;
            }
        });

        return obj;
    }

    /**
     * 判断是否字符串
     *
     * @param value
     * @returns {boolean}
     */
    static isString(value) {
        return typeof data === "string";
    }

    /**
     * 判断是否是对象
     *
     * @param value
     * @returns {boolean}
     */
    static isObject(value) {
        return typeof data === "object";
    }

    /**
     * 判断是否是数组
     *
     * @param value
     * @returns {boolean}
     */
    static isArray(value) {
        return Array.isArray(value);
    }

    /**
     * 判断是否是数字
     * 注：isNaN()函数是js自带的全局函数，isNaN() 函数用于检查其参数是否是非数字值。
     * 如果 值x 是特殊的非数字值 NaN（或者能被转换为这样的值），返回的值就是 true；如果 值x 是其他值，则返回 false。
     * isNaN()的缺点就在于 null、空格以及空串会被按照0来处理
     *
     * @param value
     * @returns {boolean}
     */
    static isNumber(value) {
        return typeof value === 'number' && !isNaN(value);
    }
}
