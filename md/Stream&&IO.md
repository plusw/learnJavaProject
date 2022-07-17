## Stream && IO
Stream 流处理集合: list.stream().filter(s->s.startswith("张 ")).filter(s->s.length()==3).forEach(s->System.out.println(s));

可以使用Stream流的:单列集合，双列集合，数组，同种数据类型的多种数据

Stream<String> stream=list.stream();//单列集合获取stream流的方法
  
HashMap<String,int> hm=new HashMap<>();
hm.put("ww",6);
hm.keySet().stream.forEach(s->System.out.println(s));
