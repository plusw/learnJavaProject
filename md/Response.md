#### 设置响应状态码
void setStatus(int sc);
#### 设置响应头键值对
void setHeader(String name,String value)
#### 设置响应体
PrintWriter getWriter();//获取字符输出流
ServletOutputSteam getOutputStream();//获取字节输出流
