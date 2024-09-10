class StringUtils {

    static trimToEmpty(str) {
        return $.trim(str);
    }

    static trimToNull(str) {
        var content = $.trim(str);
        if (content == '') {
            return null;
        } else {
            return content;
        }
    }

    static toArray(str) {
        return [str];
    }

    static toArrayIfNotNull(str) {
        if (str == null) {
            return null;
        } else {
            return StringUtils.toArray(str);
        }
    }

}