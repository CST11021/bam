class DomUtils {


    static getElementById(id) {
        return document.getElementById(id);
    }
    /**
     * 获取标签的属性值
     *
     * @param element
     * @param attributeName
     * @returns {*}
     */
    static getAttribute(element, attributeName) {
        return element.getAttribute(attributeName);
    }

    static setAttribute(attributeName, attributeValue) {
        return element.setAttribute(attributeName, attributeValue);
    }

    static setHtml(element, html) {
        return element.innerHTML = html;
    }

}