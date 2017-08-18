/**
 * Created by Мышка on 08.11.2016.
 */
function langChange(param) {
    document.cookie = "language=" + param;
    location.reload();

}

function addCookie(val) {
    document.cookie = "language=" + val + "; path=/";

}

function getCookie(name) {
    var matches = document.cookie.match(new RegExp(
        "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
    ));
    return matches ? decodeURIComponent(matches[1]) : undefined;
}