## Stream && IO
Stream 流处理集合: list.stream().filter(s->s.startswith("张 ")).filter(s->s.length()==3).forEach(s->System.out.println(s));


可以使用Stream流的:单列集合，双列集合，数组，同种数据类型的多种数据


Stream<String> stream=list.stream();//单列集合获取stream流的方法
  
  
HashMap<String,int> hm=new HashMap<>();
  
hm.put("ww",6);
  
hm.keySet().stream.forEach(s->System.out.println(s));//双列集合
  
hm.entrySet().stream.forEach(s->System.out.println(s));//双列集合
  
Arrays.stream(arr).forEach(s->System.out.println(s));//数组的Stream流方法  
  
Stream.of(1,2,3,4).forEach(s->System.out.println(s));//同种数据类型的Stream流

Stream流中的常见的中间方法:
  
  list.stream().limit(2).forEach(s->System.out.println(s));//提取前面的
  
  list1.stream().skip(2).forEach(s->System.out.println(s));//跳过前面的
  
  Stream.concat(list.stream(),list2.stream()).forEach(s->System.out.println(s));//合并流
  
  stream.distinct().forEach(s->System.out.println(s));//去重(依赖hashcode和equals方法)
  
  
  2种终结方法:
  
  int a=list.stream().count();//返回流中元素的个数
  
  list.forEach(s->System.out.println(s))
  
  
  收集方法:
 Set<Integer> set=list.stream().filter(number->number%2==0).collect(Collectors.toSet());//收集为set集合
  
 List<Integer> list1=list.stream().filter(number->number%2==0).collect(Collectors.toList());//收集为list集合
  
  
