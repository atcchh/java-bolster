<%
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    for (javax.servlet.http.Cookie cookie : cookies) {
        if ("_lufaxSID".equals(cookie.getName())) {
            request.setAttribute("lufaxSID",cookie.getValue());
        }
    }
%>
1111111111111111111<br>
<%=request.getAttribute("lufaxSID")%>