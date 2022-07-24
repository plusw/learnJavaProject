## 集合

批量初始化集合 ArrayList<String> list1=new ArrayList<>(list.of("张亮","赵丽颖","胡歌"));

集合中的stream流    list.stream().filter(a->a.startsWith("张")).filter(a->a.length()==2).forEach(a->System.out.println(a));

