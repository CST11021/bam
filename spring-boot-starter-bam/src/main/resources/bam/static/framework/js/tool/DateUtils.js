class DateUtils {

    static parse(date, format) {

    }

    /**
     * 使用示例
     *
     * // 年、月、日、时、分、秒
     * var date = jutils.formatDate(new Date(1634002035*1000),"YYYY-MM-DD HH:ii:ss");
     * // 2021-10-12 09:27:15
     *
     * //年、月、日、周
     * var date = jutils.formatDate(new Date(1634002035*1000),"YYYY-MM-DD 周W");
     * //2021-10-12 周二
     *
     * //时、分、秒
     * var date = jutils.formatDate(new Date(1634002035*1000),"HH:ii:ss");
     * //09:27:15
     *
     * @param timestamp 毫秒级的时间戳
     * @param format
     * @returns {*}
     */
    static formatDate(timestamp, format) {
        if (timestamp == null) {
            return "";
        }

        var dateUtil = new DateUtils();
        var date = new Date(timestamp);
        var arrWeek = ["日", "一", "二", "三", "四", "五", "六"];
        return format
            .replace(/yyyy|YYYY/, date.getFullYear())
            .replace(/yy|YY/, dateUtil.leftPaddingZero(date.getFullYear() % 100, 2))
            .replace(/mm|MM/, dateUtil.leftPaddingZero(date.getMonth() + 1, 2))
            .replace(/m|M/g, date.getMonth() + 1)
            .replace(/dd|DD/, dateUtil.leftPaddingZero(date.getDate(), 2))
            .replace(/d|D/g, date.getDate())
            .replace(/hh|HH/, dateUtil.leftPaddingZero(date.getHours(), 2))
            .replace(/h|H/g, date.getHours())
            .replace(/ii|II/, dateUtil.leftPaddingZero(date.getMinutes(), 2))
            .replace(/i|I/g, date.getMinutes())
            .replace(/ss|SS/, dateUtil.leftPaddingZero(date.getSeconds(), 2))
            .replace(/s|S/g, date.getSeconds())
            .replace(/w|g/, dateUtil.leftPaddingZero(date.getDay(), 2))
            .replace(/W/g, arrWeek[date.getDay()]);
    }

    /**
     * 对齐填充
     *
     * @param v
     * @param size
     * @returns {string}
     */
    leftPaddingZero(v, size) {
        for (var i = 0, len = size - (v + "").length; i < len; i++) {
            v = "0" + v;
        }
        return v + ""
    }

}
