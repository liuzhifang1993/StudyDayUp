

  中介者模式：


   1、定义
   
             用一个中介对象来封装一系列的对象交互，中介者使得各个对象不需要显示的相互引用，从而使其耦合松散。而且可以独立的改变之间的交互
             Mediator : 中介者接口。 定义各个同事之间交互需要的方法，可以是公共的通信方法，比如change方法
             ConcreteMediator: 具体中介者实现对象。需要了解维护各个同事对象，并负责具体的协调各同事之间的交互关系
             Colleague: 同事的定义，通常实现为抽象类，主要负责约束同事对象的类型，并实现一些
    
    
   2、场景：
    
                           
      test1:  
       
                      看电影：
                     
     	  1、光驱要读取光盘上的数据，然后告诉主板，她的状态改变了
  	  	  2、主板得到光驱的数据，然后把数据交给CPU进行分析处理
   	  	  3、cpu处理完成，把数据分成视频数据和音频数据，通知主板，他处理完成
   	  	  4、主板得到cpu数据，然后交给显卡和声卡，显示出声音的视频
     
     	  CDDriver --  光驱  -
                        -       
     	  CPU  --- 处理器      -  - 
                          -
                        	 - - - - MotherBoard -- 主板
      	  SoundCard -- 声卡 -   -
                        -
     	  VideoCard -- 显卡 -
      
      
     
      test2:
    
                          人员和部门的关系：多对多
            
                          存在的情景: 
     
      		1、部门合并或者部门撤销，则所有属于这个部门的人员关系要
      		2、人员离职，则该员工在所属部门的关系要删除
      		3、人员调离别的部门，则要删除和原来部门的关系，增加和新部门的关系
      
      
      
     	 Dep:  部门类
      	 User: 人员类
      	 DepUserModel : 人员和部门关系实体类
         	  int id;     //主键
         	  int depId;  //部门id
          	  int userId; //人员id
       
      	DepUserMediatorImpl: 中介者，负责维护部门和人员的关系。单例。
      
         	  List<DepUserModel> list = new ArrayList<DepUserModel>();
                                     关系的增删查改
           	 ....
      
      
      
      
     3、本质：
     
               封装交互 
      
      
      
      
      
      
      
      
      
      