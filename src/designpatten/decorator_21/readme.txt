

     装饰模式：
  
             一、说明：
      
        1、定义：
         
                              动态的给一个对象添加一些额外的职责。就增加功能而言，装饰模式比生成子类更加灵活
      
        2、应用装饰模式解决问题的思路：
         
                                       所谓透明的给一个对象增加功能，就是不能改动这个对象。比如原来对象有A功能，现在透明的增加
           B功能，就相当于动态组合A和B功能
                                      使用装饰器的客户端，首先需要创建被装饰的对象，然后创建需要的装饰对象 ，接下来就是组合装饰对象               
                              依次对前面的对象进行装饰 
  
        3、装饰模式的功能
        
                             装饰模式能够动态的为对象添加功能，是从一个对象外部来给对象增加功能，相当于改变了一个对象的外观。
                             当装饰过后，从外部使用系统的角度看，就不再是原来的需了，而是被一系列的装饰器装饰过后的对象        
                                        
        4、对象组合
         
                            一个对象功能的扩展方式，可以是继承，也可以说功能更强大、更灵活的对象组合的方式
                            有一条基本规则就是：尽量使用对象组合、而不是对象继承来扩展和复用功能，装饰模式起点就是这个原则
  
        5、装饰器
        
                                   装饰器实现了对装饰对象的某些装饰功能，可以在装饰器中调用被装饰对象的功能 ，获取相应的值，这其实
                             是一种递归调用。
                                    在装饰器中不仅仅可以给装饰对象增加功能，还可以根据需要选择是否调用被装饰的功能，如果不调用装饰对象的功能
                               那就变成完全重新实现了，相当于动态修改了被修饰对象的功能                                 
        
        6、装饰器和组件类的关系 
        
                              装饰器用来修饰组件的，装饰器一定要实现和组件一致的接口，保证是同一个类型，并具有相同的外观，这样组合完成的装饰才能递归调用下去
   
   
        7、java中的装饰模式应用
          
            Io流里面就有装饰着模式：
			DataInputStream din = new DataInputStream(new BufferedInputStream
			         (new FileInputStream("IOTest.txt")));
            FileInputStream：组合对象实现类
            DataInputStream、BufferedInputStream 都是装饰类，其装饰父类是FilterOutputStream
          
        8、装饰模式和AOP：
         
                               一般而言，都是从上到下来考虑一个项目的，而且也是分成三层的。但是实际上各个模块也是存在一些共性的，比如
                         日志管理、事物管理。
                                 这个时候AOP就出来了，他为开发者提供一个描述横切关注点的机制，并能够自动将横切关注点植入到面向对象的软件系统中             
                         以前是业务直接使用公共模块，AOP是把公共模块注入进去                      
                                 
        9、本质：
         
                              动态组合
        
        10、何时选用适配器模式：
                              在不影响其他对象的情况下，以动态、透明的方式给对象添加职责，可以使用装饰模式 
                              如果不适合子类来进行扩展的时候，可以使用装饰模式                       
         
        11、注意装饰模式和适配器模式区别
        
                                 装饰模式是改变对象的功能、而适配器模式是用来改变接口
   
      
             二、示例：  
          
        1、 有个这样的实际应用：就是如何灵活的奖金计算。
                              奖金计算是相对复杂的，尤其对于业务部门，除了业务功能负责外，还有一个麻烦之处就是计算方式还经常变动             
                              因为业务部门要调整奖金来激励士气。           
                    
                             业务复杂性：   
             a、 奖金分类：
                                              对于个人：个人当月业务奖金、个人累计奖金、个人业务增长奖金、及时回款奖金、限时成交奖金；             
                                              对于业务主管：除了个人奖金外、还有团队累计奖金、团队业务增长奖金、团队盈利奖金等
             b、计算奖金金额的基数：销售额、销售毛利、实际回款、业务成本、奖金基数
             c、针对不同的人，计算公式不一样                                                                              
              
                            针对上面问题，现在进行简化：     
                                   每个人当月业务奖金  = 当月销售额 * 3%
                                   每个人累计奖金 = 总的回款额 * 0.1%
                                    团队奖金 = 团队总销售额 * 1%    
                                    
                           不用模式的解决方案：                          
                                    
                                    
                                    
                                    
                                                                                                                                                                        