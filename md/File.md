## File
---
### File构造方法:

String path="F:\\a";

File file=new File(path);

String path2="a.txt";

File file2=new File(path,path2);

File file3=new File(file,path);

---

### File常用方法

File file=new File(F:\\a.txt);

boolean a=file.createNewFile();//创建文件,不能创建文件夹,如果文件存在会创建失败

boolean b=file.mkdir();//创建单级文件夹

boolean b=file.mkdirs();//创建多级文件夹



