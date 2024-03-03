# 一.Java

## 1.Java介绍

### 1.1.Java特点

1. JAVA语言是面向对象的(oop)
2. Java语言健壮，它的强类型机制，异常处理，垃圾的自动收集是Java程序健壮性的重要保障
3. Java语言是跨平台性的.(一个编译好的.class文件可以在多个系统下运行，这种特性被称为垮平台)
4. Java语言是解释性语言

### 1.2.Java运行机制

Java核心机制是Java虚拟机

1. JVM是一个虚拟的计算机，具有指令集并使用不同的存储区域，负责执行指令，管理数据，内存，寄存器，都包含在JDK中.
2. 不同的平台有不同的虚拟机
3.   Java虚拟机机制屏蔽了底层运行平台的差别，实现了“一次编译，到处运行”

### 1.3.什么是JDK,JRE

JDK = JRE +开发工具

JRE = JVM + Java SE标准类库

JDK = JVM+Java SE标准类库 +开发工具

只想运行开发好的.class文件，只需要JRE

JDK21:https://www.oracle.com/cn/java/technologies/downloads/#jdk21-windows



### 1.4.Java开发入门

```java
//Hello{}表示开始和结束
//public class 表示Hello是一个类，是一个public类，是一个公有的类
public class Hello {
  //编写main
  //static是静态,表示面向对象
  public static void main (String[] args){
    // public static void main (String[] args)表示一个主方法，既程序的入口
    //
    System.out.println("Hello,world!");
    //System.out.println("Hello,world!")表示输出hello world 到屏幕
    //;表示语句结束
  }
}
```

<a href="https://sm.ms/image/yTgdL7PKMBX4kjU" target="_blank"><img src="https://s2.loli.net/2023/11/07/yTgdL7PKMBX4kjU.png" ></a>

**对于修改后的Hello.java源文件需要进行重新编译，生成新的class文件，然后再进行执行，才可以生效，否则执行的还是之前的那个文件，而不是新修改的文件**





### 1.5.Java开发注意事项

1.  java源文件以.java为扩展名。源文件的基本组成部分是类(class),如本类中的Hello类

2. java应用程序的执行入口是main()方法。它有固定的书写格式：
   public static void main (String[] args){………..}

3. Java语言要严格区分大小写，大写是大写，小写是小写，不能有差别。

4. Java方法由一条条语句构成，每个语句以：“；”结束。

5. {}这都是成对出现的，缺一不可。

6. **一个源文件中最多只能有一个public类。其他类的个数不限。**

   ```java
   	public class Hello{} //这个就是public类
   				 class Hi{}
   				 class boy{}
   				//这俩个前面没有public说明不是public类，而是其他类
   ```

   <a href="https://sm.ms/image/zHV2MfOIyYBsbeh" target="_blank"><img src="https://s2.loli.net/2023/11/07/zHV2MfOIyYBsbeh.png" ></a>

7. 如果源文件中包含一个public类，则文件名必须按该类名命名

   ```java
   public class XXXXX{}
   
   public class Hello{}
   //这个就表示Hello必须当做文件名称，否则无法运行
   
   //如果文件名不是Hello就会报错：
   //类Hello是公共的，应在名为Hello.java的文件中声明public class Hello {}
   ```

8. 一个源文件中最大只能有一个public类，其他类的个数不限，也可以将main方法写在非public类中，然后指定运行非public类，这样入口方法就是非public的main方法

​	<a href="https://sm.ms/image/sTV8qZt4baNAmEc" target="_blank"><img src="https://s2.loli.net/2023/11/07/sTV8qZt4baNAmEc.png" ></a>

### 1.6转义字符

```java
	\t				//一个制表符，实现对齐功能
  \n				//换行符
  \\				//一个\(类似C语言) example：//// ,输出是//
  \"				//输出"
  \'				//输出'
  \r				//一个回车 
```

```java
// \r的使用
System.out.println("Hello!\rboy");
//输出的是boylo!
System.out.println("Hello!\r\nboy");
//输出是Hello!
//		 boy
```



### 1.7注释

- 用于注解说明解释程序的文字就是注释，注释提高了代码的阅读性
- 注释类型：1.单行注释 2.多行注释 3.文档注释

单行注释：

格式：//	**（ctrl+/）**

多行注释：

格式：/\*注释内容\*/	**（ctrl+shift+/）**

**不能多行注释套多行注释**



**文档注释：**

```java
/**
		* @auther name	
		*	@version 1.0
*/
```

```java
//把这个文件使用文档注释时
javadoc -d 文件夹名 -xx -yy 文件名.java
  //例如 
  javadoc -d	C:\\HP -auther -version Hello.java  
```



### 1.8java代码规范

1.  类,方法的注释，要以javadoc的方式来写
2. 非javadoc的注释，需要着重告诉为什么要这么写，怎么修改，应该注意什么问题
3. tab右移，shift+tab左移
4. 运算符号=左右俩边最后各加一个空格
5. 源文件使用UTF-8编码
6. 代码编写次行风格和行尾风格
7. 行宽不超过80字符

### 1.9DOS命令

DOS:Disk Operating System 磁盘操作系统

相对路径：从当前目录开始定位，形成一个路径	

..\\..\\ABC\TEST\test.java 

绝对路径：从顶级目录d，开始访问，所形成的路径

d：\\ABC\TEST\test.java 

常用DOS命令

1. dir 用来查看当前目录有什么  dir D:\\\HP

2. cd 切换到其他盘下    cd  /D  c:    切换到c盘

3. cd  ..    是切换到上一级	..\切换上一级目录

4. cd  \    切换到根目录

5. cd  ..\\..\\ABC\TEST\test.java  从一个别的目录先返回上一级目录再访问下一级目录

6. tree d：\abc   查看abc下的目录树

7. cls      清屏

8. exit    退出DOS

9. md    创建目录     md test 

10. rd      删除目录     rm test

11. copy  拷贝文件    copy   hello.txt  d：\ok.txt

12. del     删除文件 del         hello.txt

13. echo 输入内容到文件     echo hello > hello.txt 输入hello到hello.txt文件中

14. move 剪切指令    move  hello.txt  d：\ok.txt

    

     



## 2.变量

### 2.1变量基本组成

变量是程序的基本组成单位

类型 + 名称 + 值

```java
class Test {
  public static void main (String[] args){
    int a = 1;//定义一个变量，类型为int类型
    int b = 2;
    b = 11;//b里面本来放着是2，这条语句使2变成11
    System.out.println(a);//输出a,b的值
    System.out.println(b);
  }
}
```

使用步骤：

1. 声明变量： int a ；
2. 赋值： a = 60； 也叫初始化  把60赋给a
3. 使用 System.out.println(a);
4. 或者声明变量和赋值一起使用 int a = 10 ；



### 2.2变量使用的注意事项

1. 变量表示内存中的一个存储区域（不同的变量，类型不同，占用的空间大小不同， int 4个字节，double 8个字节）
2. 该区域有自己的名称
3. 变量必须先声明后使用
4. 该区域的数据可以在同一类型范围内不断变化
5. 变量在同一个作用域不能重名
6. 变量= 变量名+值+数据类型 变量三要素



### 2.3 +号的使用

1. 当左右俩边都是数值型时，则做加法运算
2. 当左右俩边有一方为字符串，则做拼接运算（不管左右）
3. 从左到右依次开始进行计算



### 2.4数据类型

<a href="https://sm.ms/image/J3LRjQ6skIigTd9" target="_blank"><img src="https://s2.loli.net/2023/11/07/J3LRjQ6skIigTd9.png" ></a>

```java
//基本数据类型
	btye 		1			-128~127
  short		2			-32768~32767
  int 		4			-2147483648~2147483647
  long		8			-2的63次方~2的63次方-1
  char		2
  bolean	1			//存放ture 和 false 
  double	8
//引用数据类型
  class		类
  interface	接口
  []			数组
```





### 2.5整数类型

1. java各整数类型有固定的范围和字段长度，不会因为操作系统的改变而改变，以便确保java程序的可移植性

2. Java的整型常量默认int类型，声明long型常量必须加‘i’或者‘L’

   ```java
   int n = 1L;//从long转换为int可能会有损失
   ```

3. java程序中变量常声明为int型，除非不足以表示大数，才用long

4. bit：计算机中最小的存储单位.byte：计算机中基本存储单元，1byte = 8 bit。



### 2.6浮点类型

浮点数 =  符号位 + 指数位 + 尾数位

尾数部分可能丢失，小数都是近似值

1. java浮点类型也有固定的范围和字段长度，不受操作系统的影响

2. java的浮点型常量(具体值)默认为double型，声明float型常量，必须后面加‘f’或者‘F’

3. 浮点型常量有俩种表示形式：

   十进制形式：例：5.12  512.0f  .512 （必须有小数点）

   科学计数法：例：5.12E2(e2是10的2次方)  5.12e-2(10的-2次方)

4. 通常情况下，应该使用double类型的，因为它比float更加精确

   double的精度比float高

5. 浮点数使用的陷阱

   ```java
   //2.7和8.1/3的比较
   double num1 = 2.7;
   double num2 = 8.1/3;
   System.out.println(num1);//2.7
   System.out.println(num2);//2.6999999999997
   //当我们对运算结果是小数的进行相等判断时，要小心
   //应该是以俩个数的差值的绝对值，应该在某个精度范围内进行判断
   System.out.println(Math.abs(num1--num2));
   //4.44485675348765E-16
   //如果直接查询得到的小数或者是直接赋值，是可以判断相等
   
   ```

   

### 2.7字符类型

字符类型可以表示单个字符，字符类型是char，char是俩个字节(可以存放汉字)，多个字符用字符串String

```java
char c1 = 'a';
char c2 = '\t';
char c3 = '泥';
char c4 = 97;  
```

1. 字符常量是用单引号（‘  ’ )括起来的单个字符

2. java中还允许使用转义字符‘ \’ 来将其后的字符转变为特殊字符常量，

   `char c1 = '\n'`

3.  在java中，char的本质是一个整数，在输出时对应的ASCII码

4. 可以直接给char赋一个整数，输出时会对应字符输出97对应的ASCII码值

5. char类型是可以进行运算的，相当于一个整数，因为都对应的有ASCII码

   ```java
   System.out.println('a' + 10);//107
   ```

   

<a href="https://sm.ms/image/yI9uDoZQbrsz1K5" target="_blank"><img src="https://s2.loli.net/2023/11/08/yI9uDoZQbrsz1K5.png" ></a>

```java
char c1 = '男';
char c2 = '女';
System.out.println(c1+c2);
//输出是一个整数，因为char字符相加是UNICODE相加，加起来还是一个整数
```

```java
public class SmallBigChar {

  public static void main(String[] args){
    char c1 = 'a';
    System.out.println(c1+1);//98
    char c1 = 'a'+1;
    System.out.println(c1);//b
  }
}
```





### 2.8布尔类型

1. 布尔类型也叫boolean类型，boolean类型数据只允许取值true和false，无null
2. boolean类型占1个字节
3. boolean类型适用于逻辑运算：if，while，do-while，for循环控制

```java
boolean pass = true
  if (pass){
    System.out.println("pass");
    else{
      System.out.println("error");
    }
  }
```





### 2.9基本数据类型转换

**自动类型转换:**

**当java程序在进行赋值或者运算的时候，精读小的类型自动转换为精度大的数据类型，这就是自动类型转换**

```java
char - int - long - float - double
byte - short - int - long - float - double  
```



1. 有多种类型的数据进行混合运算的时候，系统首先自动将所以数据转换为容量最大的那种数据类型，然后再进行计算

   ```java
   public static void main(String [] args){
     int n =10;
     float d = n + 1.1;//error
     //n是int类型转换为和1.1类型相同的doubl类型，doubl类型不能直接转换为float类型的，所以报错
     //从double转换为float类型可能会有损失
     double d = n +1.1;
     float d = n +1.1f;
     //这俩都是正确的
   }
   ```

   

2. 当我们把精度(容量)大的数据类型转换赋值给精度(容量)小的数据类型时，就会报错，反之就会自动类型转换

3. (byte short)和char之间不会相互自动转换

   ```java
   byte a = 10;
   //当把具体数赋给byte时，先判断该数是否在byte范围内，如果可以就行
   int n = 1;
   byte b = n;
   //错误：原因：如果是变量赋值，先判断类型
   char c = b;
   //错误：原因：byte不能自动转换为char
   ```

4. byte  short  char  三者可以计算，在计算时首先转换为int类型

   ```java
   byte b2 = 1;
   byte b3 = 2;
   short c = 1;
   short c2 = b2 + b3;
   //不可以，因为b2+b3计算时转换为int类型了,不能再转换为short类型
   byte b4 = b2+b3;
   //错误,因为b2+b3计算时转换为int类型了
   int s = b2 + b3;
   //这个是对的
   ```

   

5. boolean不参与转换

6. 自动提升原则：表达式结果的类型自动提升为操作数中最大的类型



**强制类型转换**

自动强制类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型，使用时要加上强制转换符（），但可能会造成精度降低或者溢出，要注意。



### 2.10基本数据类型和string类型转换

在程序开发中，我们经常需要将基本数据类型转换成String类型，或者将String类型转换成基本数据类型

- 基本类型转String类型

  格式：基本类型的值 + “ “

  ```JAVA
  int n = 10;
  float f = 1.1f;
  double d = 4.5;
  boolean b = true;
  String s1 = n + "";
  String s2 = f + "";
  String s3 = d + "";
  String s4 = b + "";
  System.out.println(s1 + " " + s2 + " " + s3 + "");
  ```

- String类型转基本数据类型

  格式：通过基本类型的包装类调用parseXX方法即可

```java
String s5 = "123";
int num1 = Integer.parseInt(s5);
double num2 = Double.parseDouble(s5);
float num3 = Float.parseFloat(s5);
long num4 = Long.paresLong(s5);
byte num5 = Byte.parseByte(s5);
boolean b = Boolean.parseBoolean(s5);
short num6 = Short.parseShort(s5);
```

- 将String类型转换成基本数据类型时，要确保String类型能够转成有效的数据。例如：我们可以将”123“转成一个整数，但是不能将”hello“转换成一个整数
- 如果格式不正确，就会异常，程序终止





## 3.运算符

### 3.1算术运算符

| 运算符 |    运算    |     范例     |   结果    |
| :----: | :--------: | :----------: | :-------: |
|   +    |    正号    |      +7      |     7     |
|   -    |    负号    |   b =11;-b   |    -11    |
|   +    |     加     |     9+9      |    18     |
|   -    |     减     |     10-8     |     2     |
|   *    |     乘     |     7*8      |    56     |
|   /    |     除     |     9/9      |     1     |
|   %    | 取模(取余) |     11%9     |     2     |
|   ++   |  自增(前)  |  a=2;b=++a;  | a=2;b=3;  |
|   ++   |  自增(后)  |  a=2;b=a++;  | a=3;b=2;  |
|  - -   |  自减(前)  | a=2;b=- - a; | a=1;b=1;  |
|  - -   |  自减(后)  | a=2;b=a- -;  | a=1;b=2;  |
|   +    | 字符串相加 | “asd”+“sdf”  | “asdsdf”; |

`a % b = a - a/b * b`

```java
System.out.println(10 %3 );//1
System.out.println(-10 % 3);//-1
System.out.println(10 % -3);//1
System.out.println(-10 % -3);//-1
```





### 3.2关系运算符

| 运算符     | 运算               | 范例                   | 结果  |
| ---------- | ------------------ | ---------------------- | ----- |
| ==         | 相等于             | 8= =7                  | false |
| !=         | 不等于             | 8!=7                   | true  |
| <          | 小于               | 8<7                    | false |
| >          | 大于               | 8>7                    | true  |
| <=         | 小于等于           | 8<=7                   | false |
| >=         | 大于等于           | 8>=7                   | true  |
| instanceof | 检查是否是类的对象 | “asd”intsanceof String | true  |



**关系运算符计算后返回的结果都是布尔值（true或者false）**

- 关系运算符的结果都是boolean型
- 关系运算符组成的表达式，我们称为关系表达式。a > b
- **比较运算符“==’”不能写成“=”**

### 3.3逻辑运算符

<a href="https://sm.ms/image/e1GLoYM6iD8BxCH" target="_blank"><img src="https://s2.loli.net/2023/11/09/e1GLoYM6iD8BxCH.png" ></a> 

<a href="https://sm.ms/image/UL8aQGjVlgWXeCJ" target="_blank"><img src="https://s2.loli.net/2023/11/09/UL8aQGjVlgWXeCJ.png" ></a>



**&&和&的使用区别：**

1. &&短路与：如果第一个条件为false，则第二个条件不会判断，最终结果为false，效率高一点
2. &逻辑与：不管第一个条件是否为false，第二个条件都要判断，效率低
3. 开发中，基本使用&&，效率更高一点

**(||和|的区别与上分一样)**

- 按位异或

  | 操作符 | 描述                                                         |
  | ------ | ------------------------------------------------------------ |
  | &      | 如果相对应位都是1，则结果为1，否则为0                        |
  | \|     | 如果相对应位都是 0，则结果为 0，否则为 1                     |
  | ^      | 如果相对应位值相同，则结果为0，否则为1                       |
  | ~      | 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。         |
  | <<     | 按位左移运算符。左操作数按位左移右操作数指定的位数。         |
  | >>     | 按位右移运算符。左操作数按位右移右操作数指定的位数。         |
  | >>>    | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 |

  



### 3.4赋值运算符

- 运算顺序从右往左计算

- 赋值运算的左边只能是变量，右边可以是变量，表达式，常量值

- 复合赋值运算符等价于下面

  `a+=3   a= a+3`

- 复合赋值运会进行类型转换

  `byte b = 3; b+=3; b++;`

  `b+=3  b= (byte)(b + 3);`





### 3.5三元运算符

条件表达式？表达式1：表达式2

1. 如果条件表达式为true，运算后的结果为表达式1；
2. 如果条件表达式为flase，运算后的结果为表示式2；

```java
int a = 2 ;
int b = 9 ;
int c = a>b?a:b;
double d = a > b ? a : b ;
```

**三元运算符为一个整体**

```java
Object obj1 = true?new Integer(1):new Double(2.0);//三元运算符是一个整体
System.out.println(obj1);
//输出1.0
```



### 3.6运算符优先级

<a href="https://sm.ms/image/P24JLIpdsum3GC8" target="_blank"><img src="https://s2.loli.net/2023/11/09/P24JLIpdsum3GC8.png" ></a>

- 运算符优先级从上到下依次减小
- 只有单目运算符，赋值运算符是从右向左的



### 3.7标识符的命名和规范

1. java对各种变量，方法和类等命名时使用的字符序列被称为标识符
2. 凡是自己可以起名字的地方都叫标识符，

规则：

1. **由26英文字母大小写，0-9，_或$组成**
2. 不能使用数字开头 `int 3ab =1;`
3. 不可以使用关键字和保留字，，但能包含关键字和保留字
4. Java中严格区分大小写，长度无限制
5. 标识符不能包含空格 `int a b = 90;`



规范：

1. 包名：多单词组成时所用字母都小写：aaa.bbb.cccc
2. 类名：接口名：多单词组成时，所有单词的首字母大写：XxxZzzYyy[大驼峰]
3. 变量名，方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个首字母大写：xxxYyyZzz[小驼峰]
4. 常量名：所有字母都大写，多单词时每个单词用下划线连接：XXX_YYY_ZZZ
5. 我们命名规范要这样遵守



### 3.8关键字

<a href="https://sm.ms/image/NIakgiZnqKxVcf4" target="_blank"><img src="https://s2.loli.net/2023/11/09/NIakgiZnqKxVcf4.png" ></a>

<a href="https://sm.ms/image/zaVX16sFtJdkbNW" target="_blank"><img src="https://s2.loli.net/2023/11/09/zaVX16sFtJdkbNW.png" ></a>





### 3.9输入控制

```java
//scan.java

import java.util.Scanner;//少这个语句，会显示不知道scanner是什么
//表示把java.util下的Scanner类导入
public class scan {
  public static void main(String[] args){

    Scanner myScanner =new Scanner(System.in);
    //创建Scanner对象，new创建一个对象
    System.out.println("name");
    String name =myScanner.next();
    //接收用户输入的值，用next
    int age =myScanner.nextInt();//接受int类型的
    Double money =myScanner.nextDouble();//接受double类型的

    System.out.println(name);
    System.out.println(age);
    System.out.println(money);

    char c1 = myScanner.next().charAt(0);
    //输入字符

  }
}
```



### 3.10进制

1. 二进制：0-1，满二进一，以0b或者0B开头的
2. 十进制：0–9，满10进一
3. 八进制：0-7，满8进一
4. 十六进制：0-9及A(10)-F(15),满十六进一，以0X或者0x开头表示，A-F不区别大小写



### 3.11原码，反码，补码

1. 二进制的最高位都是符号位（0表示正数，1表示负数）
2. 正数的原码，反码，补码都一样
3. 负数符反码=原码符号不变，其他取反
4. 负数的补码=反码+1
5. 0的反码，补码都是0
6. java没有无符号数，也就是说java中都是有符号的
7. 计算机运算的时候，都是以补码的方式来运算的
8. 我们看运算的结果都是原码





### 3.12位运算符

- 按位与 & ：俩位全为1，结果为1，否则为0
- 按位或 | ： 俩位中有一个为1，结果为1，否则为0
- 按位异或 ^ :俩位有一个为1，一个为0，结果为1，否则为0
- 按位取反 ~：0->1 1->0
- 算术右移 >>:低位溢出，符号位不变，并用符号位补溢出，高位补0
- 算术左移<<：符号位不变，低位补0
- 无符号右移>>>:低位溢出，高位补0
- 没有<<<符号

```java
1 >> 2 ;//0
1 << 2 ;//4
4 << 3 ;//32 4 * 2 * 2 * 2 = 32
4 >> 2 ;// 4 / 2 / 2 = 1 
```







## 4.控制结构

### 4.1顺序控制

- 程序从上到下逐行地执行，中间没有任何判断和跳转
- java中定义变量时采用合法的前向引用



### 4.2分支控制if-else

- 单分支：

  ```java
  if(条件表达式){
  	
    执行代码块；(可以执行多条语句)
  }
  ```

当条件表达式为true时，就会执行{}的代码，如果为false，就不执行，只有一条语句的时候可以不写，但最好写上。



- 双分支

  ```java
  if(条件表达式){
  
    执行代码块1；(可以执行多条语句)
  }
  else{
    执行代码块2;
  }
  ```

  当条件表达式成立就执行代码块1，否则执行代码块2，如果执行代码块只有一条语句，则{}可以省略，否则，不能省略。



- 多分支

  ```java
  if(条件表达式){
  
    执行代码块1；(可以执行多条语句)
  }
  else if{
    执行代码块2;
  }
  ...
    else{
      执行代码块n;
    }
  ```

  多分支可以没有else，如果有，当所以表达式都不成立，就会执行else表达式
  
  ```java
  if(b = false){
    ;
  }
  //该语句不会执行，因为这个语句是中的表达式是假的
  ```
  
  

- 嵌套分支

  ```java
  if(){
    if(){
      if(){
        ;
      }
      else{
        ;
      }
    }
  }
  ```





### 4.3switch分支结构

```java
switch(表达式){

  case 1: 
    语句块1;
    break;
  case 2：
    语句块2;
    break;
    ....
      case n:
    语句块n;
    break;

  default:
  default语句块;
    break;
}
```

1. switch关键字，表示switch分支
2. 表达式 对应一个值
3. case 常量1 ：当表达式的值等于常量1时，就执行代码块1
4. break：表示退出switch语句
5. 如果没有匹配case1就继续匹配下一个case
6. **如果一个都没匹配上就执行default语句**



```java
Scanner myScanner =new Scanner(System.in);
System.out.println.("输入一个字符(a-c)");
char c1 =myScanner.next().charAt(0);
//字符就是一个UNICODE值
switch(c1){
  case 'a':
    System.out.prinln("a");
    break;
  case 'b':
    System.out.prinln("b");
    break;
  case 'c':
    System.out.prinln("c");
    break;
    ....
      default:
    System.out.prinln("输入的字符不正确，没有匹配上的");
    break;
    //default后面有没有break都可以，这个Switch语句都执行完毕
}
```

- switch细节：

  1.   表达式数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的类型，如：输入的是字符，而常量是int

       ```java
       String c = "hello"
         //表达式的数据类型必须跟case后面的常量类型是一致的
         switch (c){
           case "hi":
             break;
       
           case "hello":
             break;
       
           default:
             break;
       
         }
       
       ```

  2.   switch(表达式)中表达式的返回值必须是：(byte,short,int,char,enum[枚举],String)

       ```java
       double c =1.1;
       switch (c){
       
         case 1.1:
           break;//错误
       }
       ```

  3.     **case子句中的值必须是常量，而不能是变量**

       ```java
       switch (c){
         case c2://错误，c2是变量
           break;
       
         case 1+1 ://1+1是个常量
           break;
       }
       ```

       

  4.   default子句是可选的，当没有匹配的case时，执行default

  5.   break语句用来执行完一个case分支后使程序跳出Switch语句块。如果没有写break，程序会顺序执行到Switch结尾，除非遇到break语句

       ```java
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("请输入一个小写字母：");
       String input = scanner.nextLine();
       
       if (input.length() == 1 && Character.isLowerCase(input.charAt(0))) {
         String output = input.toUpperCase();
       
         System.out.println("对应的大写字母是：" + output);
       }
       else {
         System.out.println("输入不合法，请输入一个小写字母！");
       ```

       

### 4.4.for循环

- 语法：

  ```java
  for(循环变量初始化;循环的条件;循环变量迭代){
    	循环语句;
  }
  ```

  1.   for关键字，表示循环控制

  2.   for四要素：

       (1):循环变量初始化

       (2):循环条件

       (3):循环操作

       (4):循环变量迭代

  3.   循环操作，这里可以有多条语句，也就是我们需要去执行的代码

  4.   如果循环语句只有一条，可以把{}省略，但最后不要省略

  5.   循环条件是返回一个布尔值的表达式

  6.   for（；循环判断条件；）中的初始化和变量迭代可以写到其他的地方，但是俩边分号不能省略

       ```java
       for (int i = 1 ; i < 10 ; i++){
         ;
       }
       System.out.println(i);
       //不能成功打印出i的值，因为i的作用域是在上面的循环体中，不能作用于下面的
       
       int i = 1;
       for(;i = 1 ; i++){
         ;
       }
       System.out,prinln(i);
       //这种就可以成功打印
       
       for(;;){
         //表示一个循环，死循环
         System.out.println("ok~");
       }
       ```

  7.   循环初始值可以有多条初始化语句，但要求类型一样，并且用中间逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开

       ```java
       for(i = 1, j =1; i < 100; i++, j++){
       
         System.out.println("i="+i+"j="+j);
       }
       ```



### 4.5.while循环

```java
while(循环条件){
  循环条件;
  循环变量迭代;
}
```

- 循环条件是返回一个布尔值的表达式
- while循环是先判断再执行语句





### 4.6.do-while循环

```java
do{
  循环体;
  循环变量迭代;
  
}while(循环条件);
```

- 先执行再判断
- 最后又一个分号
- 循环条件是返回一个布尔值的表达式
- do..while循环先执行，再判断，因此至少执行一次





### 4.7.break语句

- break语句用于终止某个语句块的执行，一般使用在Switch或者循环中

- 基本语法：

  {……..

  break;

  …………

  }



1. break语句出现在多层嵌套的语句块中时，可以通过标签指明要终止的是哪一层的语句

   ```java
   label1:{
     label2:{
       label3:{
         break label2;
       }
     }
   }
   ```

2. break语句可以指定退出哪层

3. label1是标签，名字是由程序员指定

4. break后指定到哪个label就退出到哪里

5. 在实际开发中，尽量不使用标签

6. 如果没有指定的break，默认退出最近的循环体     





### 4.8.continu语句

1. continue语句用于结束本次循环，继续执行下一次循环

2. continue语句出现在多层嵌套循环语句体中，可以通过标签指明要跳过哪一条语句，这个使用和之前面的标签的使用规则一致

3. 基本语法：

   ```java
   {........
     continue;
    ........
   }
   ```

   ```JAVA
   int i = 1;
   while(i<= 4){
     i++;
     if(i==2){
       continue;
     }
     System.out.println("i="+i);
   }
   //3 4 5
   ```

   



### 4.9.return语句

return的使用方法：

如果return写在main方法，会退出程序

```java
int i = 1;
while(i<= 4){
  i++;
  if(i==2){
    return;
  }
  System.out.println("i="+i);
}
```







## 5.数组

### 5.1.数组的介绍

 数组可以存放多个同一类型的数据。数组也是一种数据类型，是一种引用类型：既数组就是一组数据

```java
double[] arr1 = {1,2,3,4,5,6.6,7};
//double[] 表示是double类型的数组，数组名arr
//{1,2,3,4,5,6.6,7}表示数组的元素，依次表示数组的第几个元素
for(i = 0; i < 6 ;i++){
  System.out.println("第"+(i+1)+"个元素="+arr[i]);
}
//下标是从0开始编号的

int a = arr1.length;
//数组名.length是用来求数组长度
```



- 数据类型  数组名 [] = new 数据类型[大小]

  ```java
  int arr[] = new int [5];
  int[] arr = new int [5];
  //这俩个定义数组的方式都可以使用
  //创建了一个数组，名字a，存放五个int
  int[] arr2 =new int[]{1,2,34};
  int[] arr2 =new int[3];
  ```

  ```java
  import java.util.Scanner;
  
  public class arrr2 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //开辟空间并且声明
  
      double[] scores = new double[5];
      //赋值
      for(int i=0;i < scores.length ;i++){
        scores[i] = input.nextDouble();
      }
      //打印出来
      for(int i= 0 ;i<scores.length;i++){
        System.out.println(scores[i]);
      }
    }
  }
  
  ```

  

- 先声明数据类型

  语法：数据类型  数组名[]；或者 数据类型[] 数组名；

  int a [];或者 int[] a;
  
- 创建数组

  语法：数组名 = new 数据类型[大小]；

  a = new int[10];

  ```java
  double scores[];//声明数组，这时scores是NULL
  scores = new double [5];//分配内存空间，存放数据
  //声明后不分配内存空间，使用数组的时候就会报错
  ```

- 静态初始化

  初始化数组：

  语法：数据类型  数组名[] = {元素值，元素值..}

  ```java
  int a[] = {2,3,4,5,6,7,8,4,5,3,4};
  ```

  

### 5.2.数组的注意事项和细节

1. 数组是多个相同类型的数据的结合，实现对这些数据的统一管理

2. 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但不能混用

3. 数组创建后，如果没有赋值，则会有默认值

   ```java
   int 0; short 0; byte 0; long 0; float 0 ; double 0.0;
   char \u0000; boolean false; String NULL;
   ```

4. 步骤：1.声明数组并开辟空间 2.给数组各个元素赋值 3.使用数组

5. 数组的下标都是从0开始的

6. 数组下标必须在指定范围内使用，否则会报错，下标越界异常，比如：int[] arr = new int[5];则有效下标为0-4

7. 数组属于引用类型(地址)，数组型数据是对象。



### 5.3.数组的赋值机制

- 基本数据类型赋值，这个值就是具体的数据，而且相互不影响

  ```java
  int n1 =10;
  int n2 =n1;
  n2 =80;
  //int n2 =n1是n2指向的地方去拷贝n1指的的地方的值，拷贝到n2指向的地方，也就是这时n2=10，改变n2的值并不会改变n1的值，这时令n2=80，也就是把n2的值改变了
  ```

- 数组在默认情况下是引用传递(地址拷贝)，赋的值是地址

  ```java
  int[] arr1 = {1 , 2 , 3};
  int[] arr2 = arr1;
  arr2[0] = 10;
  for(int i =0 ;i < arr1.length;i++){
    Sysetm.out.print(arr1);
  }
  //输出为10,2，3
  //int[] arr2 =arr1.是把arr1指向数组的地址拷贝一份，也就是说这时arr2和arr1都指向同一空间,无论改变arr1还是arr2中的元素都会改变
  ```

  

<a href="https://sm.ms/image/bLgJRMcOkKurTqt" target="_blank"><img src="https://s2.loli.net/2023/11/11/bLgJRMcOkKurTqt.png" ></a>



### 5.4.冒泡排序

- 内部排序：指将需要处理的所以数据都加载到内部储存器中进行排序，包括(交换式排序法，选择式排序法和插入式排序法)
- 外部排序：数据量大，无法全部加载到内存中，需要借助外部储存进行排序，包括(合并排序法和直接合并排序法)



- 冒泡排序：通过对待排序序列从前向后排(从下标较大的元素开始)，依次比较相邻元素的值，若发现逆序则交换，使值较大的元素逐渐从前向后移动，就像水底下的气泡一样逐渐向上冒 

  ```java
  public class BubbleArray {
    public static void main(String[] args){
      int[] arr1 = {24,69,80,57,13};
      //创建数组
  
      for(int j = 0; j< arr1.length-1;j++){
        //多轮排序用for循环
  
        //实现一次冒泡排序
        for (int i = 0; i < arr1.length - 1; i++) {
          //前面的数大于后面的数就交换 
          if (arr1[i] > arr1[i + 1]) {
            int tmp = 0;//辅助交换
            tmp = arr1[i];
            arr1[i] = arr1[i + 1];
            arr1[i + 1] = tmp;
            //排序一次
          }
        }
      }
      //输出arr1数组的各个元素
      for (int i = 0; i < arr1.length; i++) {
        System.out.print(" " + arr1[i]+"\t");
      }
    }
  }
  ```

  



### 5.5.查找

- 顺序查找

  ```java
  int[]arr = { 1, 2 , 3, 4};
  Scanner myScanner =new Scanner(System.in);
  System.out.println("num");
  int findNum =myScanner.next();
  
  int intdex = -1;
  for(int i =0;i < arr.length;i++){
    if(findNum.equals(arr[i])){
      System.out.println("win"+findNum);
      System.out.println("下标为"+i);   
  
      index = i;
      System.out.prinntln("no have");
      break;
    }
  }
  ```

  

- 二分查找(二分法)

  



### 5.6.二维数组

```java
int[][] arr = {{1,2},{2,3},{3,4}};
System.out.println("二维数组的元素个数="+arr.length)
  //输出为：二维数组的元素个数为3
  System.out.println(arr[i].length);
//输出为2，求的是每一个一维数组的长度
```



- 动态初始化

  语法：类型[][] \[ ]\[ ]数组名 =new 类型\[大小]\[大小]

  例如：int\[ ]\[ ] arr =new int\[2]\[3];

<a href="https://sm.ms/image/omvDwNWlXTL5KBc" target="_blank"><img src="https://s2.loli.net/2023/11/11/omvDwNWlXTL5KBc.png" ></a>

- 先声明：类型 数组名\[ ]\[ ];
- 再定义  数组名 = new 类型\[大小]\[大小]
- 赋值



```java
//有三个一维数组，但每个数组的元素都不一样
int[][] arr =new int[3][];//创建二维数组，但是只确定一维数组的个数
//创建三个一维数组，但每个一维数组还没有开数据空间
for(int i = 0; i<arr.length;i++){
	
  //给每一个一维数组开空间new
		arr[i] = new int[i+1];
  //如果没有给一维数组new，那么arr[i]就是NULL
  
  //给一维数组的每个元素赋值
  for(int j =0; j < arr[i].length;j++){
    arr[i][j] = i+1;//赋值
  }
}

System.out.println("---------");

//输出arr每个数组的元素
for(int i =0;i<arr.length:i++){

  for(int i =0;j< arr[i].length;j++){
    System.out..print(arr[i][j] + " ");
  }
  
  System.out.println();//换行
}
```



- 静态初始化

  类型  数组名\[ ]\[ ] = {{ 1,2},{3,4},4,5,6};

  `int[][] arr = {{1,2},{3,4},{4,5}};`

  

### 5.7二维数组的使用细节和注意事项

1. 二维数组是由多个一维数组组成的，它的各一维数组的长度可以相等，也可以不同

2. `map[][] = {{1,,2},{3,4,5}};`

   map\[0]是含有俩个元素的的一维数组，，map\[1]是一个含有三个元素的一维数组构成的，我们叫做列数不等的二维数组



## 6.面向对象编程(初级)

### 6.1类与对象(OOP)

1. 单独的定义变量解决
2. 使用数组解决

```java
class Cat {//创建一个猫类
      String name;
      int age;
      String color;
}

    Cat cat1 = new Cat(); //创建一只猫的属性
    cat1.name = "白";
    cat1.age = 13;
    cat1.color = "white";

//访问对象的属性
    System.out.println("第一只猫"+cat1.name+cat1,age+cat1.color);
```

**类似c语言的结构体**

<a href="https://sm.ms/image/ZFvQMJOfCX8arEz" target="_blank"><img src="https://s2.loli.net/2023/11/11/ZFvQMJOfCX8arEz.png" ></a>



- 成员变量 = 属性 =field(字段)(既成员变量是用来表示属性的，统一叫属性)

- 属性是类的一个组成部分，一般是基本数据类型，也可以是引用类型(对象，数组).例如：int age就是属性

  ```java
  class Car{
    String name;//属性，成员变量，字段field
    double price;
    String color;
  	String[] master;
    //属性可以是基本数据类型，也可以是引用类型(数组对象)
  }
  ```

  

### 6.2注意事项和细节说明

1. 属性定义语法同变量，例如：访问修饰符 属性类型 属性名;

   访问修饰符：控制属性的访问范围

   有四种访问修饰符 public protected 默认

2. 属性的定义类型可以为任意类型，包含基本类型或引用类型

3. **属性如果不赋值，有默认值，规则和数组一致。**

   例如：[Person类]

   ```java
   public static void main (String[] args){
    Person p1 =new Person();
    System.out.println("age =" +p1.age);
    System.out.println("sal =" +p1.sal); 
     
   }
   class Person{
     int age;
     Stirng name;
     double sal;
     boolean isPass;
   }
   ```





### 6.3如何创建对象和访问属性

1. 先声明再创建

   ```java
   Cat cat ;//声明对象cat
   cat = new Cat();//创建
   ```

2. 直接创建

   ```java
   Cat cat = new Cat();
   ```

3. 访问属性

   对象名.属性名；

   ```java
   Cat.name;
   Cat.age;
   Cat.color;
   ```

   <a href="https://sm.ms/image/lCX3onpDdH8fJLT" target="_blank"><img src="https://s2.loli.net/2023/11/11/lCX3onpDdH8fJLT.png" ></a>

4. 类和对象的内存分配机制

   栈：一般存放基本数据类型(局部变量)

   堆：存放对象(Cat cat,数组等)

   方法区：常量池(常量，比如字符串)，类加载信息

   ```java
   Person p = new Person();
   p.name ="jack";
   p.age = 10;
   ```

1. 先加载Person类信息(属性和方法信息，只会加载一次)
2. 在堆中分配空间，进行默认初始化，把地址赋给p，p就指向对象
3. 把地址赋给p,p就指向对象
4. 进行指定初始化，比如：`p.name = “jack" p.age =10`



<a href="https://sm.ms/image/xfP3IFSczbLJd4M" target="_blank"><img src="https://s2.loli.net/2023/11/11/xfP3IFSczbLJd4M.png" ></a>

```java
Person a = new Person();
a.age = 10;
a.name = "小明"；
Perso b;
System.out.println(b.name);//10
b.age = 200;
b=null;
System.out.println(a.age);//200
System.out.println(b.age);//NULL
```







### 6.4成员方法

- 在某些情况下，我们需要定义成员方法(简称方法)，这时候就需要成员方法才能完成，现在要求对person类完善

  public static void main(String[] args){
  
    Person p1 = new Person();
    p1.speak();//调用方法
  }
  
  calss Person {
    String name;
    int age;
    //public 表示方法是公开的
    //void 表示方法是没有返回值的
    //speak() speak是方法名，()形参列表
    //{} 方法体，可以写我们要执行的代码
    //System.out.println(”我是一个好人“);
    //表示我们的方法就是输出一句话
  
    public void speak(){
      System.out.println("我是一个好人");
    } 
  }
  
  ```JAVA
  
  public static void main(String[] args){
   
    p1.cal01();
    p1.cal02(5);//调用cal01方法，传入5
    int retRes = p1.getSum(12,24)
  	//调用getSum方法，传入12,24
  	//retRes接受getSum的返回值，赋给retRes
  	System.out.print(retRus);
    //打印出retRus的值
  }
  
  calss Person{
  //1+2+....+1000
  public void cal01(){
     int ret = 0;
     for(int i = 0 ; i<=1000; i++){
  			ret+=i;
     }
       System.out.print(res);
   }
  
  //1+....+n
  public void cal02(int n){
     int ret = 0;
     for(int i = 0 ; i<=n i++){
  			ret+=i;
     }
       System.out.print(res);
   }
  
  //计算俩个值的和
  //(int num1,int num2)形参列表，2个形参，可以接受用户传入的俩个数
  //return ret; 表示把ret的值返回 
  //  
  public int getSum(int num1,int num2){
  		int ret = num1 +num2;
    		return ret;
  	}
  }
  ```



<a href="https://sm.ms/image/76J9r1knWyzYfeo" target="_blank"><img src="https://s2.loli.net/2023/11/13/76J9r1knWyzYfeo.png" ></a>

  **优点：**

- 提高代码的复用性
- 可以将实现的细节分装起来然后供其他用户来调用即可



**成员方法的定义：**

```java
public 返回数据类型  方法名 (形参列表...){
  方法体语句;
  return 返回值;
}
```

1. 参数列表：表示成员方法的输出cal(Int n)
2. 数据类型(返回类型)：表示方法输出，void表示没有返回值
3. 方法主体：表示为了实现某一功能代码块
4. return 语句不是必须的



**注意事项和细节:**

1. 一个方法最多有一个返回值

   ```java
   public static void main(String[] args){
   
     AA a = new AA();
     int [] res =a.getSumAndSub(1,4);
     //用数组来接受数组
     System.out.println(res[0]);
     System.out.println(res[1]);
   
   }
   
   class AA{
     //这个gstSumAndSub的返回值是int[] 也就是一个数组.
     public int[] gerSumAndSub(int n1, int n2){
   		int[] resArr =new int[2];
       //创建一个数组
       resArr[0] = n1+n2;
       resArr[1] = n1-n2;
       return resArr;
   	}
   }
   ```

   

2. 返回类型可以为任意类型，包含基本类型或引用类型（数组，对象）

3. 如果方法要求有返回数据类型，则方法体中最后执行的语句必须为return值，返回值必须和return的值类型一致或者兼容(会自动进行类型转换，可以int–>double,但不能double->int)

4. 如果方法是void，则方法体中可以没有return语句，或者只写return

   ```java
    public void f2() {
      	System.out.print("hi");
      return ;//不能有返回值
    }
   ```

5. 方法名

   遵循驼峰命名法，最好见名知意，表达该功能的意思





**形参列表：**

1. 一个方法可以有0个参数，也可以有多个参数，中间有逗号隔开，比如：getSum(int n1, int n2)

2. 参数类型可以为任意类型，包含基本类型或者引用类型，比如：printArr(int \[]\[] map)

3. 调用待参数的方法时，一定要对应着参数列表传入相同类型或兼容类型（getSum）

4. 方法定义时的参数称为形式参数，简称形参；方法调用是的参数称为实际参数，简称实参，实参和形参的类型要一致或者兼容，个数，顺序必须一致！（不能方法需要俩个参数，而只传了一个参数）

5. 方法体不能套方法体

   ```java
   //1
   public void f2(){
    
     public void f3(){
     }//error
   }
   
   //2
   public void f3(){
     
   }
   public void f4(){
     
   }//yes  
   ```

6. 同一类中的方法调用：直接调用即可

   ```java
    A a =new A();
    a.sayOk();
   
   }
   class A {
     public void print(int n ){
   		System.out.println("print");
     }
     public void sayOK(){
       print(10);
       System.out.println("sayOk"); 
     }
     //在俩个不同类中调用对象，应先创建对象
   	B b = new B();
     b.hi();//然后再调用
   
   }
   class B{
     public void hi(){
   		System.out.print("hi")
     }
   }
   ```

7. 基本数据类型，传递的是值(值拷贝)，形参给定任何改变不影响实参

 **int\[]是引用类型，传的是一个地址**

<a href="https://sm.ms/image/beZvlwKfsSQjydE" target="_blank"><img src="https://s2.loli.net/2023/11/13/beZvlwKfsSQjydE.png" ></a>

**p.age跟int\[]的方法一样，都是指向堆中的一个地址，改变p.age都会改变实参的值**

<a href="https://sm.ms/image/v7CjAMXomkK35Nr" target="_blank"><img src="https://s2.loli.net/2023/11/13/v7CjAMXomkK35Nr.png" ></a>

<a href="https://sm.ms/image/G96tNDP1jEalA8p" target="_blank"><img src="https://s2.loli.net/2023/11/13/G96tNDP1jEalA8p.png" ></a>

<a href="https://sm.ms/image/xRYXhWu7g81Cbi5" target="_blank"><img src="https://s2.loli.net/2023/11/13/xRYXhWu7g81Cbi5.png" ></a>



### 6.5递归

<a href="https://sm.ms/image/2pzdJNXUPrh7jSG" target="_blank"><img src="https://s2.loli.net/2023/11/13/2pzdJNXUPrh7jSG.png" ></a>

```java
//阶乘
public int factorial(int n){
	if(n == 1){
		return 1;
  }else{
    return factorial(n-1)*n;
  }

}
```

<a href="https://sm.ms/image/ERbYQCX7uF8rqw5" target="_blank"><img src="https://s2.loli.net/2023/11/13/ERbYQCX7uF8rqw5.png" ></a>

1. 执行一个方法时，就创建一个新的受保护的独立空间(栈空间)

2. 方法的局部变量是独立的，不会相互影响，比如n变量

3. 如果方法中使用的是引用类型变量(数组，对象),就会共享该引用类型的数据

4. 递归必须先退出递归的条件逼近，否则就是无限递归

5. 当一个方法执行完毕，或者遇到return，就会返回，遵守谁调用谁，就将结果返回谁，同时当方法执行完毕的或者返回时，该方法也就执行完毕

   



### 6.6方法重载

- 介绍

  java中允许同一个类中，多个同方法的存在，但要求形参列表不一样。

  比如：System.out.println();out是PrintStream类型

- 重载的好处

  1. 减轻了起名字的麻烦
  2. 减轻了记名的麻烦

  ```java
  System.out.println(100);
  System.out.println(n);
  System.out.println('A');
  System.out.println("abc");
  //这个使用就是方法重载
  //要求形参列表不一样
  System.out.println();
  System.out.println(boolean x);
  System.out.println(char x);
  System.out.println(char[] x);
  System.out.println(形参);
  ```



```java
public class EightEmpeor {
    public static void main(String[] args) {

      MyCalculator mc = new calculator();
      System.out.println(1,2);//俩个int，调用的是俩个int的的方法
      System.out.println(1.0,2);
      System.out.println(1,2.0);
      //一个double，一个int，调用的是一个double一个int的类的方法，跟一个int，一个double的方法是不一样的
    }
}
class MyCalculator{
  //编写一个类
  
  //下面的四个 calculator方法构成了重载
  //俩个int
  public int calculator(int n1,int n2){
    return n1 + n2;
  }
  //一个int，一个double
   public double calculator(int n1,double n2){
    return n1 + n2;
  }
  //一个double一个int
   public double calculator(double n1,int n2){
    return n1 + n2;
  }
  //三个int和
   public int calculator(int n1,int n2,int n3){
    return n1 + n2 + n3;
  }
  
}
```



- 注意事项

  1. 方法名字必须相同

     ```java
     //俩个int
       public int calculator(int n1,int n2){
         return n1 + n2;
       }
       //一个int，一个double
        public double calculator1(int n1,double n2){
         return n1 + n2;
       }
     //这俩个的方法名都不一样，所以不能构成方法重载
     ```

  2. 形参列表必须不同(形参的类型或个数或顺序，至少有一种是不一样的)

     ```java
     //1.java
     //俩个int
     public int calculator(int n1,int n2){
       return n1 + n2;
     }
     //一个int，一个double
     public double calculator(int n1,double n2){
       return n1 + n2;
     }
     //他们俩的形参列表不一样
     
     //2,java
     //一个int，一个double
     public double calculator(int n1,double n2){
       return n1 + n2;
     }
     //一个double一个int
     public double calculator(double n1,int n2){
       return n1 + n2;
     }
     //这俩个的形参俩个都有double和int，但顺序不一样，所以也是可以的
     
     //3.java
     public int calculator(int n1,int n2){
       return n1 + n2;
     }
     public int calculator(int a1,int a2){
       return n1 + n2;
     }
     //只能根据形参类型和个数或者顺序不同来寻找，不能根据参数名来寻找，所以这俩个是重复了  
     
     //4.java
     public int calculator(int n1,int n2){
       return n1 + n2;
     }
     public int calculator(int a1,int a2){
       int ret = n1+n2;
     }
     //也是方法的重复定义，error
     ```

  3. 不需要看返回类型 



### 6.7可变参数

- 概念：

  java允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法，就可以通过可变参数实现

- 语法：

  访问修饰符  返回类型  方法名(数据类型…. 形参名){  }

  ```java
  class Methods{
    public int sum(int.... nums){
      //int... 表示接受的是可变参数，类型是int，既可以接受多个int(0~多)
      //使用可变参数时，可以当做数组来使用，既nums可以当做数组
      System.out.println(nums.length);//传几个参数 输出为几
      int ret = 0 ;
      for(int i = 0;i<nums.length;i++){
        ret = nums[i];
        return ret;//当做数组使用
      }
    }
  }
  ```

- 注意事项和细节：

  1. 可变参数的实参可以为0个，或任意多个

  2. 可变参数的实参可以为数组

     ```java
     public class a{
     
       public static void main(String[] args){
       int [] arr = {1,2,3};
       T t1 =new T();
       t1.f1(arr);
       }
     }
     class T {
       public void f1(int...nums){
         
         System.out.println(nums.length);
         //长度为3
       }
     }
     ```

  3. **可变参数的本质是数组**

  4. 可变参数可以和普通类型的参数一起放在形参列表，但必须保证，可变参数在最后

     ```java
     public void f1(int...nums,String str){
         //传入错误，可变参数没有在最后
         System.out.println(nums.length);
       }
     
     public void f1(double d1,double...nums){
         //√
         System.out.println(nums.length);
       }
     ```

  5. 一个形参列表中只能出现一个可变参数

     ```java
     public void f1(int...nums,double....num2){
       //只能有一个可变参数，语法不允许
         System.out.println(nums.length);
       }
     ```



### 6.8作用域

- 基本使用

  1. 主要的变量就是属性(成员变量)和局部变量

  2. 我们说的局部变量一般是指在成员方法中定义的变量

      ```java
      class Cat{
        int age = 10;
        //这个age的作用域在整个类体，也就是在这个cat类中都可以使用
        
        public void cry(){
          int n =1 ;
          String name = "jack";
          //这些就是局部变量
          //n和name就是局部变量
          //n和name的作用域在cay方法中
        }
        
        public void eat() {
          System.out.println(age);
          //这里的age使用的就是上面的age
        }
      }
      ```

  3. 全局变量可以不赋值，直接使用，因为有默认值，局部变量必须赋值后，才能使用，因为没有默认值

     ```java
     class Cat{
     
       int num;//这是全局变量，有默认值，为0
       public void cry(){
     
         int num2;
         System.out.println(num2);
         //报错，这是局部变量，没有默认值
         //必须赋值后才能使用
       }
     }
     ```

- 注意事项

  1. 属性和局部变量可以重名，访问时遵循就近原则

     ```java
     //1.java
     class Person{
       String name = "jack";
       
       public void say(){
         System.out.println(name);
         //输出为jack
       }
     }
     
     //2.java
     class Person{
       String name = "jack";
       
       public void say(){
         String name = "king"
         System.out.println(name);
         //输出为king
       }
     }
     ```

     

  2. 在同一个作用域中，比如在同一个成员方法中，俩个局部变量，不能重名

     ```java
     //3.java
     class Person{
       String name = "jack";
     
       public void say(){
         String name = "king"
           System.out.println(name);
         //输出为king
       }
       public void hi(){
         String address = "北京"；
           String name = "dsad";
         //跟上面不冲突，定义域不一样
       }
     }
     ```

     

  3. 属性生命周期较长，伴随对象的创建而创建，伴随对象的死亡而死亡。局部变量，生命周期较短，伴随它的代码块执行而创建，伴随代码块的结束而死亡，既在一次方法调用过程中

     ```java
     public static void main(String[] args){
       Person p1 = new Person();
       
       p1.say();
       //当执行say方法时，say方法的局部变量比如name，会创建，当say执行完毕后,name局部变量就会销毁，但是属性(全局变量)仍然可以使用
     }
     ```

- 作用域范围不同

  全局变量/属性：可以被本类使用，或其他类使用(通过对象调用)

  局部变量：只能在本类中对应符方法中使用

  ```java
  public static void main(String[] args){
    Person p1 = new Person();
  
    p1.say();
    t1.test();
    t1.test2(p1);
  }
  
  class T {
    public void test(){
      Person p1 = new Person();
      //全局变量可以在本类，也可以在其他类使用
      System.out.println(p1.name);//jack
      //在别的类中调用这个name也是可以的
    }
    public void test2(Person p){
      System.out.println(p.name);//jack
    }
  }
  
  class Person{
    String name = "jack";
  
    public void say(){
      System.out.println(name);
      //输出为jack
    }
  }
  ```

- 修饰符不同

  全局变量/属性：可以被本类使用，或其他类使用(通过对象调用)

  局部变量：只能在本类中对应的方法中使用





### 6.9构造器

- 基本语法：

[修饰符] 方法名（形参列表）{

​		方法体；

}

1. 构造器的修饰符可以默认
2. 构造器没有返回值
3. 方法名 和 类名字必须一样
4. 参数列表 和 成员方法一样的规则
5. 构造器的调用是系统完成的

- 基本介绍：

构造方法又叫构造器(constructor),是类的一种特殊方法，它的主要作用是完成对**新对象的初始化**

1. 方法名和类名相同
2. 没有**返回值**
3. 在创建对象时，系统会自动调用该类的构造器完成对象的初始化

```java
public static void main (String[] args){
	
  Person p1 = new Person;
  System.out.println(p1.name);
  System.ouy.println(p1.age);
}

class Person{
  String name;
  int age;
  
  //构造器没有返回值，也不能写void，void也是一种返回值
  //构造器的名称必须和上面的Person一致
  //(Sting pName, int pAge）是构造器的形参列表，规则和成员方法一样
  public Person(Sting pName, int pAge){
    name = pName;
    age = pAge;
  }
}
```

- 注意事项

  1. 一个类可以定义多个不同的构造器，既构造重载

     ```java
     class Person {
       //第一个构造器
       public Person(String pName, int pAge){
         name = pName;
         age = pAge;
       }
       //第二个构造器，只指定人名，不需要指定年龄，这是构造重载
       public Person(String pName){
         name = pName;
       }
     }
     ```

  2. 构造器和类名要相同

  3. 构造器没有返回值

  4. 构造器是完成对象的初始化，并不是创建对象

  5. 在创建对象时，系统自带的调用该类的构造方法

  6. 如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)

     ```java
     class Dog{
       /*默认构造器 
       Dog() {
       }
       */
     }
     ```

  7. 一旦定义自己的构造器，默认的构造器就覆盖了，就不能再使用默认的无参构造器，除非显式的定义一下

     ```java
     class Dog{
       public Dog(String dName){
       }
       Dog(){
         //显式定义一下 无参构造器
       }
     }
     ```

- 对象创建的流程分析

  <a href="https://sm.ms/image/c71pL8mRDxYieoy" target="_blank"><img src="https://s2.loli.net/2023/11/15/c71pL8mRDxYieoy.png" ></a>

流程：创建这个p的时候，age和name都是初始化，也就为0和null，当执行到int age = 90时，这个0就变成了90，继续执行下面，当执行到（“小明”，20）时，这个name和age都换成这俩，这是才开始赋值，最后执行完毕

1. 加载Person类信息是在方法区加载的，只会加载一次

2. 在堆中分配地址

3. 完成对象初始化(先默认初始化 age =0,name =null，然后在显示初始化 age = 90，name =null， age = 20， name = 小明)

4. 在对象在堆中的地址，返回给p(p是对象名，也可以理解为对象的引用)

5. 只有new一个对象,就会进行类的加载就会调用构造器

6. 只使用类中的静态变量也会进行 **类加载**

   



### 6.10this关键字

- 什么是this

  java虚拟机会给每个对象分配this，代表当前对象

- 深入理解this

  <a href="https://sm.ms/image/6UuOzACbshZrNBp" target="_blank"><img src="https://s2.loli.net/2023/11/15/6UuOzACbshZrNBp.png" ></a>

- **哪个对象调用，就是哪个对象的this**

  ```java
  class Dog{
    public Dog(String name,int age){
      this.name = name;//this.name就是当前对象的属性name
      this.age = age;//this.age 就是当前对象的属性age
      System.out.println(this.hasCode());
    }
    public void info(){
      System.out.println(this.hashCode());
    }
  }
  ```

- 注意事项

  1. this关键字可以用来访问本类的**属性，方法和构造器**

     ```java
     class T{
       String name ="jack";
       int num =100;
       
       public void f3(){
         
         String name = "smith";
         
         System.out.println("name=" + name + "num=" +num);
         //这个name访问是根据就近原则访问的name，也就是上面的smith
         //所以输出为name=smith，num=100
        
         System.out.println("name=" + this.name + "num=" +this.num);
         //这个name是被this定义了，所以访问是是属性的name，也就是jack
         //输出为name=jack，num=100
       }
     }
     ```

  2. **this用于区分当前类的属性和局部变量**

  3. 访问成员方法的语法：this.方法名（参数列表)

  4. 访问构造器语法：this(参数列表);**注意只能在构造器中使用**

     ```java
     class T{
     
       //访问构造器语法：this(参数列表)
       //只能在构造器中使用(既只能在构造器中访问另外一个构造器)
     
       public T(){
         //去访问T(String name,int age)构造器必须放在第一跳语句中
         this("jack",90);
         System.out.println("T() 构造器");
       }
     
       public T(String name, int age){
         System.out.println("T(String name, int age)构造器")
       }
     }
     //输出为T(String name,int age)
     //     T()
     //this() 的主要作用是在一个构造器中调用同一类的另一个构造器，以便避免重复的初始化代码。
     //this() 是一个用于调用同一类中其他构造器的特殊语法。它必须作为构造器的第一行语句，因为在对象被完全初始化之前，不能调用其他构造器
     ```
  
  5. this**不能在类定义的外部使用，只能在类定义的方法中使用**
  
     ```java
     class Grand{
       //这是超类
       String name = "AA";
       private int age = 100;
       public void g1{}
     }
     class Father extends Grand{
       
       //这是父类
       String id ="001";
       private double score;
       public void f1(){}
       //super可以访问哪些类
       super.name；
         super.g1();
       //this可以访问哪些成员
       this.id;
         thi.score;
       this.name;
       this.g1();
     }
     class Son exends Father {
       
       //子类
       String name ="BB";
       public void g1(){};
       private void show(){};
       
       //super可以访问哪些类
       super.id;
       super.f1(){};
       super.name;
       super.g1(){};
       
       //this可以访问哪些成员
       this.name;
       this.g1(){};
       this.show();
       this.id;
       this.f1();
     }
     ```
  
     





## 7.面向对象编程(进阶)

### 7.1IDEA快捷键

ctrl + z 删除当前行

ctrl + alt + 向下光标 复制当前行

ctrl + /	注释

ctrl + alt + l 快速格式化代码

win + r 快速运行程序

alt + enter 快速分配变量名称

.var 也是自动分配变量名称

alt + insert 生成构造器

ctrl + h 查看类的层级关系

ctrl + b 快速定位下一个





### 7.2包

1. 区分相同名字的类
2. 当类很多时，可以很好的管理类
3. 控制访问范围



- 包的语法

  package com.hspedu；

  1. package 关键字,表示打包
  2. com.hspedu表示包名

- 包的本质就是实际上就是**创建不同的文件夹来保存类文件**

  ```java
  public static void Dog{
    import com.xiaoqiang.Dog;
  
    //引入包名就不需要在下面使用Dog类的使用再说明了
    Dog dog = new Dog();
    System.out.println(dog);
    //com.xiaoqiang.Dog@1540e19d
  
    com.xiaoming.Dog dog1 =new com.xiaoming.Dog();
    //这个没有引入包名，就需要全部打出，才能知道是哪个包名中的Dog类
    System.out.println(dog1);
    //com.xiaoming.Dog@6777327b6
  
  }
  ```

- 包的命名

  规则：只能包含数字，字母，下划线，小圆点，但不能用数字开头，不能是关键字，保留字

  ```java
  demo.class.exec1//错误，其中有class关键字
  demo.12a//不能用数字开头
  demo.ab12.oa//可以
  ```

- 命名规范

  一般是小写字母 + 小圆点

  com.公司名.项目名字.业务模块名

  ```java
  com.hspedu.oa.model;
  com.hspedu.oa.controller;
  com.sina.crm.user//用户模块
  com.sina.crm.order;
  ```

-  常用的包

  ```java
  java.lang.* //lang包是基本包，默认引入，不需要再引入
  java.util.* //util包，系统提供的工具包，工具类，使用Scanner
  java.net.* //网络包，网络开发
  java.awt.* //是做java的界面开发，GUI  
  ```

- 如何引用包

  ```java
  //jacom.hspedu.pkg:Import01.java
  语法 ： import 包;
  //我们只引入一个包的主要目的是使用该包下的类
  import java.util.Scanner;//就是只引入一个类Scanner
  import java.util.*//表示将java.util包所用都引入
  ```

- 注意事项

  1. package的作用是声明当前类所在的包，需要放在类的最上面，一个类中最多只有一个package
  2. impor指令位置放在package的下面，在类定义前面，可以有多句且没有顺序要求

  ```java
  package com.hspedu.pkg//包类只能放在第一位
    import java.util.Scanner;
  	import java.util.Arrays;
  //在类与package之间
  //类定义
  public class PkgDetail{
    public static void main(String[] args){
      Scanner scanner = new Scanner (System.in);
    	int[] arr = {0, -1, 1};
      Arrays.sort(args);
    }
  }
  ```

  

<a href="https://sm.ms/image/qswytIDLhQpBNCU" target="_blank"><img src="https://s2.loli.net/2023/11/16/qswytIDLhQpBNCU.png" ></a>



### 7.3访问修饰符

java提供四种访问控制修饰符号 ，用于控制方法和属性（成员变量）的访问权限（范围）

1. 公开级：用public修饰对外公开
2. 受保护级别：用protected修饰，对子类和同一个包中的类公开
3. 默认级别：没有修饰符号，向同一个包的类公开
4. 私有级别：用private修饰，只有类本身可以访问，不对外公开

<a href="https://sm.ms/image/3AtXzLDY4jJaxK5" target="_blank"><img src="https://s2.loli.net/2023/11/17/3AtXzLDY4jJaxK5.png" ></a>

- 注意事项
  1. 修饰符可以用来修饰类中的属性，成员方法以及类
  2. 只有默认的和public才能修饰类，并且遵循上述访问权限的特点
  3. 成员方法的访问规则和属性一样
  4. 在不同的包下，只有public能够被访问



### 7.4*封装\*

- 介绍

  封装（encapsulation)就是把**抽象出的数据（属性）和对数据的操作（方法）封装在一起**，数据被保护在内部，**程序的其他部分只有通过被授权的操作（方法),才能对数据进行操作**

- 优点

  1. 隐藏实现的细节
  2. 可以对数据进行验证，保证安全合理

- 实现步骤

  1. 将属性私有化private（不能直接修改属性）

  2. 提供一个公共的set方法，用于对属性判断并赋值

     public void setXxxx(类型  参数名){//Xxx表示某个属性

     //加入数据验证的业务逻辑

     属性 = 参数名

     }

  3. 提供一个公共的（public）get方法，用于获取属性的值

     public 数据类型 getXxxx(){

     //权限判断

     return xx；

     }

  ```java
  class Person{
    public String name ;
    private  int age;
    
    //使用快捷键写出setAge和getAge  alt+ins
    //根据要求完善代码
    //this表示哪一个对象调用就是哪个
    
    public void setAge(int age) {
      if (age >= 1 && age <= 120){
        this.age = age;
      }else {
        System.out.println("error");
        this.age = 18;
        //给一个默认值
      }
    }
  
    public int getAge() {
      return age;
    }
    
    public void setName(String name) {
      //判断数据的准确
      if(name.length() >=2 && name.length()<=6) {
        this.name = name;
      }else{
        this.name ="XXX";
        System.out.println("name is error");
        //相当于增加业务逻辑
      }
    }
  	public String getName() {
      return name;
    }
  	
    //输出信息
    public  String info(){
      return "信息为name="+name+"  age"+age;
    }
  }
  
  ```

  ```JAVA
  { 
    Persom DICKER = new Persom("dicker",200);
    System.out.println(DICKER.info());
    //输出为DICKER,200
  }
  
  
  class Persom{
   
    public String name ;
    private  int age;
    //使用快捷键写出setAge和getAge
    //根据要求完善代码
    //this表示哪一个对象调用就是哪个
    
    public Person(){
      
    } 
    
    public Persom(){
      //有俩三个属性的构造器
      this.age=age;
      this.name=name;
    }
    
    
    public Persom(String name,int age){
      setName(name);
      setAge(age);
      //将set方法写在构造器中，这样仍然可以验证
      //
    
    }
    
  }
  ```

  ```java
  public Account1(){
  
  }
  
  public Account1(String name, double money, String mima){
    this.setMoney(money);
    this.setMima(mima);
    this.setName(name);
  }
  //先创造一个空构造器，再造一个构造器传参数 
  ```

  



### 7.5**继承\*\*

<a href="https://sm.ms/image/plJdC41OUHVwFWo" target="_blank"><img src="https://s2.loli.net/2023/11/17/plJdC41OUHVwFWo.png" ></a>

- **继承可以解决代码的重复性，当多个类存在相同的属性(变量)和方法时，可以从这些类中抽象出父类**，在父类中定义这些相同的属性和方法，所有的子类不需要重新定义这些属性和方法，只需要**通过extends来声明继承**父类即可

- 基本语法

  class 子类 extends 父类{

  }

  1. 子类就会自动拥有父类的定义和方法
  2. **父类又叫超类，基类**
  3. 子类又叫派生类

- 优点

  1. 代码的复用性提高了
  2. 代码的拓展性和维护性提高了 

- 细节 

  1. 子类继承了所有的属性和方法，但是**私有属性不能在子类直接访问**，要通过父类提供公共的方法去访问

     ```java
     //1.java
     public class Base {
       public int n1 = 100;
       protected int n2 = 200;
       int n3 = 300;
       private n4 =400;
       
       public Base(){
         System.out.print("base()...");
         //构造器
       }
       
       public void test100(){
        System.out.print("test100"); 
       }
       
       protected void test200(){
         System.out.print("test200 ");
       }
       
         void test300(){
         System.out.print("test300 ");
       }
       
        private void test400(){
         System.out.print("test400 ");
       }
     }
     
     //2.java
     public class Sub extendes Base{
       public Sub(){
         System.out.print("sub()....");
       }
       public void sayok(){
         //父类的非private的属性和方法都可以访问
       }
     }
     ```

  2. 子类**必须调用父类的构造器**，完成父类的初始化

     ```java
     public Sub(){
     
       super();//默认调用父类的无参构造器
       System.out.print("Sub()...");
     }
     ```

  3. 当创建子类对象时，**不管使用子类的哪个构造器，默认情况下总会调用父亲的无参构造器**，**如果父类没有提供无参构造器，则必须对父类的初始化工作，否则，编译不会通过** 

     ```java
     class Base{
       //public Base (){
       //无参构造器，注释了
       //}
     
       public Base(String name, int age){
         //有参构造器
         System.out.println("父类Base(String name,int age)构造器被调用....");
     
       }
     
     }
     //如果父类有一个有参构造器，并且把无参构造器覆盖，而子类想要去初始化对象，就必须在构造器中写出 super(父类构造器的形参)
     
     
     //例如 
     public class Sub extends Base{
       //子类
       public Sub(){
         super("dicker",10);
         System.out.println("子类Sub()构造器被调用....");
       }
     }
     ```

  4. 如果希望指定去调用父类的某个构造器，则显式调用一下： super（参数列表）

     ```java
     public class Sub extends Base{
       //子类
     
       //如果要调用父类的无参构造器，或者什么都不写，默认用的就是super（）
       super();//父类的无参构造器
     
       //调用父类的Base(String name)构造器
       super("dicker");//父类的有参构造器
     
       //调用父类的Base(Stirng name,int age)构造器
       super("king",20);
     
       System.out.println("子类Sub(String name, int age)构造器被调用....");
     }
     ```

  5. super在使用的时候，必须放**在构造器的第一行**

  6. **super()和this()都只能放在构造器的第一行**，因此这俩个方法不能存在一个构造器中

  7. java所以类都是objec类的子类，object是所有类的基类

  8. 父类构造器的调用不限于直接父类，将一直往上追溯到object类（顶级父类）

  9. 子类**最多只能继承一个父类**(直接继承),既java中是单继承机制

  10. 不能滥用继承，子类和父类之间必须满足is-a的逻辑关系

      可以先让a继承b，再让b继承c，就可以实现a继承了b和c的俩种类

      

- **继承的本质分析**

当子类对象创建好后，建立查找的关系 

1.  首先看子类是否有该属性

2. 如果子类有这个属性，并且可以访问，则返回信息

3. 如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回该信息..)

4. 如果父类没有，就按照3的规则，继续往上找父类，直到objec，如果都没有就会报错

   ```java
   public class ExtendsTheory{
     public static void main(String[] args){
       
       Son son = new Son();//内存的布局
       
       System.out.println(son.name);//返回就是儿子
       System.out.println(son.age);//报错
       System.out.println(son.getAge);//39
       
       System.out.println(son.hobby);//返回就是旅游
     }
   }
   
   class GrandPa{
     //爷类
     String name = "爷爷";
     String hobby = "旅游";
   }
   
   class Father extends GrandPa{
     //父类
     String name = "爸爸";
     private int age = 39;//私有的类，只能在本类中使用
   
     public int getAge(){
       return age;
     }
   }
   
   class Son extends Father {
     //子类
     Stirng name = "儿子";
   }
   ```

   

<a href="https://sm.ms/image/hNpYcaxADOJvW5t" target="_blank"><img src="https://s2.loli.net/2023/11/17/hNpYcaxADOJvW5t.png" ></a>



### 7.6super关键字

- 介绍

  super代表**父类的引用**，用于访问父类的属性，方法，构造器

- 语法

  1. 访问父类的属性，但不能访问父类的private属性

     super.属性名；

     ```java
     public class B extends A {
       public void hi(){
         System.out.println(super.n1+" "+super.n2+" "+ super.n3);
       }
     }
     ```
     
     

  2. 访问父类的方法，不能访问父类的private方法

     super.方法名（参数列表）；

     ```java
     public void ok(){
       super.test100();
       super.test200();
       super.test300();
       super.test400();//不能访问父类的private方法
     }
     ```
  
     

  3. 访问父类的构造器

     super(参数列表)；

     只能放在构造器的第一句，只能出现一句。

     ```java
     public D (){
       super();//调用无参构造器
       super(21);//调用有参构造器
     }
     ```
  
- 优点

  1. 通过调用父类的构造器的好处（分工明确，父类的属性由父类初始化，子类的属性由子类初始化）

  2. 当子类中有和父类中的成员（属性和方法）重名时，为了访问父类的成员，必须通过super，如果没有重名，使用super，this，直接访问是一样的

     ```java
     //B.JAVA
     public void sum(){
       System.out.println("B类的sum()");
     }
     //A.JAVA
     public void cal(){
       System.out.println("A类的cal()方法...");
     }
     //想要去调用父类-A的cal方法
     //这时，由于子类B没有cal方法，就可以使用下面三种方式
     //1.先找本类，如果有，则调用
     //2.如果没有，则找父类(如果有，并可以调用，则调用)
     //3.如果父类没有，则继续找父类的父类，整个规则就是一样的，直到object类
     //提示：如果查找方法的过程中，找到了，但是不能访问，则报错
     //如果查找方法的过程中么有找到，则提示方法不存在
     ```

     ```java
     cal();
     this.cal();//与上面的cal（）;一样的作用
     super.cal();//找cal方法的顺序是直接查找父亲，与其他规则一样
     ```

     ```java
     System.out.println(n1);
     System.out.println(this.n1);//一样
     ```

  3. **super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员**，如果多个基类（上级类）中都有同名的成员，使用super访问遵循就叫原则。A->B->C

- super和this的比较

  <a href="https://sm.ms/image/mU2GHApTRQc5CzS" target="_blank"><img src="https://s2.loli.net/2023/11/17/mU2GHApTRQc5CzS.png" ></a>

**this是从本类开始找，super是从父类或者超类开始找**




### 7.7方法重写/覆盖

- 介绍

  方法覆盖就是子类有一个方法，和父类的某个方法的名称，返回类型，参数都是一样的，那么我们就说子类的这个方法覆盖了父类(不一定是父子关系)的那个方法

  ```java
  //Test.java
  package override;
  
  public class Test {
      public static void main(String[] args) {
          Dog dog = new Dog();
          dog.cry();
      }
  }
  
  //Animal.java
  package override;
  
  public class Animal {
      public void cry(){
          System.out.println("~~~");
      }
  }
  
  //Dog.java
  package override;
  
  public class Dog extends Anmail {
      public void cry(){
          //Dog是Anmail的子类
          //Dog的cry方法和Animal的cry的定义形式一样（名称，参数，返回类型）
          //这是我们就说Dog的cry方法，重写了Animal的cry方法
          System.out.println("bark~");
      }
  }
  //输出bark~
  ```

- 注意事项

  1. 子类的方法的参数，方法名称，要和父类的参数，方法名称完全一样

  2. 子类的返回类型和父类的返回类型一样，或者是父类返回类型的子类

     ```java
     public Object m1(){
       //父类
       return null;
     }
     
     public String m1(){
       //子类
       return null;
     }
     //String是引用数据类型，他是Object的子类 
     ```

  3. 子类方法不能缩小父类方法的访问权限

     ```java
     
     public String m1(){
       //父类
       return null;
     }
     
     public Object m1(){
       //子类
       return null;
     }
     //由于Object不是String的子类，所以报错
     ```

     

<a href="https://sm.ms/image/dXmM2tRGV6kANrc" target="_blank"></a>

| 名称 | 发生范围 | 方法名 | 形参列表                         | 返回类型                                                   | 修饰符                             |
| ---- | -------- | ------ | -------------------------------- | ---------------------------------------------------------- | ---------------------------------- |
| 重载 | 本类     | 一致   | 类型，个数或者顺序至少有一个不同 | 无要求                                                     | 无要求                             |
| 重写 | 父子类   | 一致   | 相同                             | 子类重写的方法，返回类型和父类返回的类型一致，或者是其子类 | 子类方法不能缩小父类方法的访问范围 |



### 7.8**\*多态\*\*\*

- 介绍

  **对象或方法具有多种形态，是面向对象的第三大特征，多态是建立在封装和继承基础之上的。**

  ```java
  package override;
  
  public class Poly {
    public static void main(String[] args) {
  
      //方法重载体系多态
      A a = new A();
      //我们传入不同的参数，就要调用不同的Sum方法，就体现了多态
      System.out.println(a.sum(10,20));
      System.out.println(a.sum(10,20,30));
  
      //方法重写体系多态
      B b =new B();
      a.say();
      b.say();
  
    }
  }
  
  class B {
    //父类
    public void say(){
      System.out.println("B say()方法被调用...");
    }
  }
  
  class A extends B {
    //子类
    public int sum(int n1,int n2) {//和下面的sum构成重组
      return n1 + n2;
    }
    public int sum(int n1,int n2,int n3) {
      return n1 + n2+n3;
  
    }
  }
  ```

  

- 重要知识点

  1. 一个对象的**编译类型和运行类型可以不一致**

     `Animal animal = new Dog();`

     anmial编译类型是Animal，运行类型是Dog.

  2. 编译类型在定义对象时，就确定了，不能改变

  3. 运行类型是可以改变的

     `Animal animal = new Dog();`

     `animal = new Cat();`

     animal的运行类型变成了Cat，编译类型仍然是Animal

  4. 编译类型看定义时 = 的左边， 运行类型看 = 的右边

  ```java
  public class PolyObject {
    public static void main(Stirng[] args){
      //体现对象多态的特点
      //animal 编译类型就是Animal，运行类型为Dog
      Animal animal = new Dog();
      //animal运行类型是Dog，所以cry就是Dog的cry
      animal.cry();
      
      //animal 编译类型是 Animal，运行类型就是Cat
      animal = new Cat();
      animal.cry();
    }
  }
  ```

- 注意事项

  1. 前提：俩个对象（类）存在继承关系

  2. 多态的向上转型

     `Animal animal = new Dog();`

     这就是一种向上转型

  3. **不能调用子类的特有成员**

     ```java
     animal.catchMouse();
     //这个catchMouse是Cat特有的，但是它的父类没有，所以不能调用这个catchMouse这个方法
     //因为在编译阶段，能调用哪些成员，是有编译类型决定的
     ```

  4. 最终运行效果看子类的具体实现

     `animal.eat();`

     先看子类有没有这个方法，没有，再去找父类，以此类推

     它只看animal这个的运行类型是谁，不管编译类型是什么

  5. 多态的向下转型

     **子类类型  引用名 = （子类类型）  父类引用；**

     （1）只能强转父类的引用，不能强转父类的对象

     （2）要求父类的引用必须指向的是当前目标类型的对象

     （3）当向下转型后，可以调用子类类型中所有的成员

     ```java
     Cat cat = (Cat) animal;
     //向下转型，编译类型是Cat，运行类型也是Cat
     cat.catMouse();
     //可以使用catMouse了 
     ```

  6. **属性的值看编译类型**

     ```java
     public classs PolyDetail02{
       public static void main(String[] args){
         Base base = new Sub();//向上转型
         System.out.println(base.count);//10
         Sub sub = new Sub();
         System.out.println(sub.count);//20
         //看编译类型是什么，属性就去那个编译类型中找
       }
     }
     
     class Base{//父类
       int count = 10;//属性
     }
     
     class Sub extends Base{//子类
       int count = 20;//属性
     }
     ```

  7. **instanceof 用于判断某个变量是否为某个类的类型或其子类型**

     用于判断对象的运行类型是否为XX类型或者XX类型的子类型

     ```java
     public static void main(Stirng[] args){
       BB bb = new BB();
       System.out.println(bb instanceof BB);//true
       System.out.println(bb instanceof AA);//true
     
       AA aa = new BB();
     	System.out.println(aa instanceof AA);//true
       System.out.println(aa instanceof BB);//true
       
       Object obj = new Object();
       System.out.println(obj instanceof AA);//false
       
       String str = "hello";
       System.out.println(str instanceof Object);//true
     }
     
     class AA{}//父类
     class BB extends AA{}//子类
     ```

     **属性看编译类型，方法调用看运行类型**

- **java的动态绑定机制**

  1. 当调用对象方法的时候，该方法和该对象的**内存地址/运行类型绑定**

  2. 当调用对象属性时，**没有动态绑定机制，哪里声明，就在哪里使用**

     ```java
     public static void main(String[] args){
       A a = new B();
       System.out.println(a.sum());//30
       System.out.println(a.sum1());//20
     }
     
     class A {
       public int i =10;
       public int sum(){
         return geti() + 10;
       }
       public int sum1(){
         return i + 10;
       }
       public int geti(){
         return i;
       }
     }
     
     class B extends A{
       public int i =20;
       //  public int sum(){
       //    return i + 20;
       //  }
       //  public int sum1(){
       //  return i + 10;
       // }
       public int geti(){
         return i;
       }
     }
     
     //当我们去调用这个a.sum()的时候，看的是运行类型，a的运行类型是B，所以先去B中找sum的类，但是B中的sum类被注释了，也就是不存在了，就根据继承机制去A中找sum方法，在A中找到了sum方法，但是返回的是geti()+10,这个geti()也要运行，所以只有运行，就要再返回到B中去找geti方法，在B中找到了geti()方法之后，就要返回值，这个值是i，也就是属性，只要是属性，这个属性在哪里，就调用哪里的，这个i是在B方法中，所以直接调用B方法中的i，也就是20，最后得到的结果是30
     //当我们去调用a.sum1()的时候，我们继续看运行类型是什么，运行类型是B，我们就去B中找方法，但是B中的sum1方法被注释了，我们就根据继承机制继续去父类中找，在父类A中找到了sum1方法，我们就调用它，返回值是i+10，这个i在A中，所以我们直接调用这个A中的i，结果就是20
     ```

     ```java
     package PolyArray;
     
     public class PolyArrat1 {
       //创建一个person对象
       //2个student对象和2个老师，统一放在数组中，并调用每个对象say方法
       public static void main(String[] args) {
         Person[] persons = new Person[5];
     
         persons[0] = new Person("dicker",20);
         persons[1] = new Student("jim",20,99);
         persons[2] = new Student("john",23,66);
         persons[3] = new Teacher("lao ba",32,500000);
         persons[4] = new Teacher("smith",20,56453);
     
         //循环遍历数组，调用say方法
         for (int i = 0; i < persons.length; i++) {
           System.out.println( persons[i].say()) ;//动态绑定机制
           //编译类型是Person，但运行类型一直在改变，Person,Student,Teacher 
     }
     ```



### 7.9Object类

- equals方法

  1. = = 是一种比较运算符

  2. 既可以判断基本类型，又可以判读引用类型

  3. 如果判断基本类型，判断的是值是否相等

  4. 如果判断引用类型，判断的是地址是否相等，既判断是不是同一个对象

  5. equals:是Object类中的方法，只能判断引用类型

  6. **默认判断的是地址是否相等**，**子类中往往重写该方法，用于判断是否相等**

     比如：Integer，String

     ```java
     Integer integer1 = new Integer(1000);
     Integer integer2 = new Integer(1000);
     
     System.out.println(integer1 == integer2);//false
     System.out.println(integer1.equals(integer2));//true
     
     String str1 = new String("dicker");
     String str2 = new String("dicker");
     
     System.out.println(str1 == str2);//false
     System.out.println(str1.equals(str2));//true
     
     ```

     **String中的equals已经重写了，所以比较跟object中的equals不同，不比较引用类型，而是比较值是否相等**
     
     **object中的equals默认是比较地址是否相等**
     
     ```java
     class Person{
       //类
       public Stirng name;
       //这个类没有重写equals，所以还是用object类的equals来比较的
     }
     
     Person p1 = new Person();
     p1.name = "dicker";
     
     Person p2 = new Person();
     p2.name = "dicker";
     
     System.out.println(p1 == p2);
     //==判断俩个引用类型时,判断的是p1,p2是否指向同一个对象，p1,p2这俩个对象都是NEW出来的，所以他俩并不指向同一个对象,所以为false
     System.out.println(p1.name.equals(p2.name));
     //p1.name是字符串，所以重写了，比较的p1.name和p2.name的内容是否相等，所以为true
     System.out.println(p1.equals(p2));
     //由于p1,p2是Person类，也就是Person，这个Person的类没有重新equals，所以比较的俩个对象是否相同，所以为false
     
     String s1 = new String ("asdf");
     String s2 = new String ("asdf");
     System.out.println(s1.equals(s2));
     //p1是字符串，所以比较是俩个内容是否相等
     System.out.println(s1 == s2);
     //s1和s2不是同一个对象，所以返回为false
     ```
     
     ```java
     char ch1 = 'A';//A的ASCII码值为65,字符其实就是数字
     char ch2 = 12;
     System.out.print(65 == ch1);
     //== 比较是值是否相等，所以返回true
     System.out.print(12 == ch2);
     //true
     
     String str1 = new String("Hi");
     Stirng str2 = new String("Hi");
     System.out.print(str1 == str2);
     //字符用==比较，是比较俩个对象的地址是否一致，由于这俩对象都new了一个新的对象，所以对象不一样，不相等，返回false
     System.out.print(str1.equals(str2));
     //字符用equals比较是重写了，所以比较是内容是否相等，所以返回为true
     System.out.print("hello" == new java.sql.Date());//俩边比较的类型不同，直接报错
     
     ```
     
     **==用于基本数据类型，判断的是值相等，用于引用数据类型，是判读俩个 对象是否相等，也就是地址是否相等，equal是不能用于基本数据类型的，它默认是判断俩个对象是否相等，但是子类往往重写该方法，比较对象的属性是否相等，比如（String，Integer）**
     
     
  
- hashCode方法

  1. 提高具有哈希结构容器的效率

  2. 俩个引用，如果指向的是一个对象，则哈希值肯定是一样的

     ```java
     A a3 = a;
     System.out.println(a.hashcode());
     //35655673597
     //内部地址通过转化方式变成的一个哈希值
     ```

  3. 俩个引用，如果指向不同的对象，则哈希值是不一样的

     ```java
     A a = new A();
     A a2= new A();
     System.out.println(a.hashcode);//35655673597
     System.out.println(a2.hashcode);//1735600054
     ```

  4. 哈希值主要根据地址号来的，不能完全将哈希值等价于地址

  5. 在集合中，如果hashcode需要的话，也会重写

- toString方法

  1. 介绍

     默认返回：全类名（包名加类名）+ @ + 哈希的十六进制

     ```java
     //Object中toString()源码
     //getClass().getName() 类的全类名(包名 + 类名);
     //Integer.toHexStirng(hashCode())将对象的hashCode值转成16进制字符 
     public Stirng toString(){
       return getClass().getName() + "@" + Ingeter.toHexString(hashCode());
     }
     ```

     **toString就是把hashcode值转成16进制字符串**

  2. 重写toString方法

     ```java
     public String toString() {
       return "Employee{" +
         "name='" + name + '\'' +
         ", salary=" + salary +
         '}';
     }
     //重新的toString内容
     ```

  3. 当直接输出一个对象时，toStirng方法会被默认调用

     ```java
     Monster monster = new Monster("dicker","run",100);
     
     System.out.println(monster.toString() + "hashCode" +monster.hashCode());
     System.out.println(monster);//等价于调用toString()
     //上面俩种代码的输出方式都一样
     //Monster{name='dicker',job='run',sal = 1000.0} hashcode = 356573597
     ```

- finalize方法

  1. 当对象被回收的时候，系统自动调用该对象的finalize方法，子类可以重写该方法，做一些释放资源的操作

  2. 什么时候被回收：当某个对象没有任何引用时，则jvm就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用finalizze方法

     ```java
     Car bmw = new Car("bao ma");
     bmw = null;
     //这个对象没有任何引用，变成垃圾了
     //这时就销毁我们的对象
     ```

     

  3. 垃圾回收机制的调用，是由系统来决定的，也可通过System.gc()主动触发垃圾回收机制，测试

  4. 实际开发中，并不会使用finalize







### 7.10断点调试

- 介绍

  断点调试是指在程序的某一行设置一个断点，调试时，程序运行到这个一行就会停住，然后一步一步往下调试，调试的过程中可以看各个变量当前的值，出错的话调试到出错的代码既显示错误，停下，进行分析，从而找到这个bug

- 快捷键

  F7（跳入）

  F8（跳过） 

  shift + F8（跳出）

  F9（resume，执行到下一个断点）

  F7：跳入方法内

  F8：逐行执行代码. 

  shift +F8:跳出方法（强制）

  alt + shift + F7(强迫进入)




### 7.11向下转型和向上转型

```java
package HomeWork07;

public class Test {
  public static void main(String[] args) {
    Doctor doctor1 = new Doctor("jack",22,"doctor","男",4000);
    Doctor doctor2 = new Doctor("jackr",22,"doctor","男",4000);

    System.out.println(doctor1.equals(doctor2));
  }
}

class Person{
  public void run(){}
  public void eat(){}

}
class Student extends Person{
  public void run(){}
  public void study(){}
}
//向上转型：父类的引用指向子类对象
Person p = new Student();
//因为编译类型是Person，所以调用方法时只能调用父类的方法
//而不能调用子类的，例如：p.study();这就是错的
p.run();//运行类型是子类，所以运行时是从子类开始找，所以运行的是子类的run方法
p.eat();//子类没有eat，由于子类继承了父类，所以去找父类的方法，也就是运行是父类的eat


//向下转型：把指向子类对象的父类引用，转成指向子类对象的子类引用
Student s = (Student) p;
s.run();
//编译类型和运行类型都为子类，所以编译时，看子类有哪些方法和父类的哪些方法
s.study();
s.eat();//person eat
//子类没有eat，编译和运行都是父类的，子类继承了父类的
```

```java
for(int i = 0; i < persons.length; i++){
  homework13.test(persons[i]);//遍历数组，先判断是什么类型的，再进行打印
}

//定义方法，形参为Person类型，功能：调用学生的study或者教师teach方法
//下面代码是判断使用到向下转型和类型判断
public void test (Person p){
  if(p instanceof Student){
    ((Student) .p).study();
  }else if(P instanceof Teacher){
    ((Student) .p).teach();
  }else{
    System.out.println("do nothing...");
  }
}
```





## 8.面向对象编程(高级）

### 8.1类变量和类方法

**类变量也叫静态变量用static修饰**

```java
public class ChildGame {
    public static void main(String[] args) {
        int count = 0;

        Child child1 = new Child("dicker");
        child1.join();
        child1.count++;

        Child child2 = new Child("joker");
        child2.join();
        child2.count++;

        //类变量，可以通过类名来访问
        System.out.println("共有"+Child.count + "小孩加入了游戏.......");

        System.out.println("child1.count="+child1.count);
        System.out.println("child2.count="+child2.count);
    }
}

class Child{
    //类
    private String name;
    //定义一个变量count，是一个类变量（静态变量）static 静态
    //该变量的最大特点就是被Child 类所有的对象实例共享
    public static int count = 0;
    public Child(String name){
        this.name =name;

    }
    public void join(){
        System.out.println(name + " 加入了游戏.....");
    }
}

//dicker 加入了游戏.....
//joker 加入了游戏.....
//共有2小孩加入了游戏.......
//child1.count=2
//child2.count=2
```



- 类变量内存布局

类变量存在的区域是不一样的，在JDK8以后是在堆里面，会生成一个class对象用来存放静态变量，而在JDK8以前是放在方法区内的，方法区中会有一个静态域的东西，用来存放静态变量。不管在堆还是在静态域都不会影响这个静态变量的使用 

static变量是对象共享的，不管static变量在哪里

1. static变量是同一个类所有对象共享的
2. static类变量，在**类加载**的时候就生成了 



- 什么是类变量

  类变量也叫静态变量/静态属性，是该类的所有对象共享的变量，任何一个该类的对象去访问它时，取到的都是相同的值，同样任何一个该类对象去修改它时，修改的都同一个变量

- 如何定义一个类变量

语法：

访问修饰符  static  数据类型  变量名：[推荐]

`public static int a ;`

static 访问修饰符  数据类型 变量名；

`static public int a ;`

- 如何访问类变量

  类名 . 类变量名

  
  
  或者  对象名 . 类变量名（静态变量的访问修饰符的访问权限和范围 和普通属性都是一样的 （满足访问规则）
  
  ```java
   public static void main (String[] args){
     //类名.类变量名
     //类变量是随着类的加载而创建，所以即使没有创建对象实例也可以访问
     System.out.println(A.name);
     A a = new A();
     //通过对象名.类变量名
     System.out.println("a.name" + a.name);
     System.out.println("a.name" + a.sex);
     //不能访问，sex是私有的，只能在该类访问，只能访问name
   }
  
  class A {
    //类变量
    //类变量访问，必须遵守 相关的访问权限
    public static String name = "dicker";
    private static String sex = "未知";
  }
  ```
  
- 使用方法或细节

  1. 当我们需要让某个类的所有对象都共享一个变量的时候，就可以考虑使用类变量（也叫静态变量）：比如：定义学生类，统计所有学生共交多少钱的时候

  2. 类变量与实例变量（也就普通变量的区别）

     类变量是该类所有对象共享的，而实例变量是每个单独对象独享的

  3. 加上static被称为类变量或者静态变量，否则称为实例变量/普通变量/非静态变量

  4. 类变量可以通过 类名.类变量  或者对象名.类变量名 来访问，但最好使用  类名.类变量名方式访问（前提条件是满足访问修饰符的访问权限和范围）
  
  5. 实例变量不能通过 类名.类变量名 方式访问。
  
     ```java
     public static void main(String[] args){
       B b = new B();
       System.out.println(B.n1);//不能访问，非静态变量
       System.out.println(B.n2);//可以访问，是静态变量
     }
     class B {
       public int n1 = 100;
       public static int n2 = 200;
     }
     ```
  
     
  
  6. 类变量是在类加载时就初始化了，也就是说，即使你没有创建对象，只有类加载了，就可以使用类变量了
  
  7. 类变量的生命周期是随类的加载开始，随类消亡而销毁
  
- 类方法

  类方法也叫静态方法

  使用如下：

  `public static void method1(){}`

  `static public void method2(){}`

- 类方法的调用

  类名 . 类方法 或者 对象名 . 类方法

  ```java
  public static void main(String[] args){
    Stu tom = new Stu("tom");
    Stu.payFee(100);
    //tom.payFee(100);
    
    Stu mary = new Stu("mary");
    Stu.payFee(200);
    //mary.payFee(200);
    
    Stu.showFee();//300
  }
  classs Stu {
    private String name;
    private static double fee = 0;
    
    public Stu(String name){
      this.name = name;
    }
    //当方法使用static修饰后 ，该方法就是静态方法
    //静态方法就可以访问静态属性/变量
    public static void payFee(double fee){
      Stu.fee +=fee;
    }
  }
  ```

- 什么时候使用类方法

  当方法中不涉及到任何和对象相关的成员，则可以将方法设计成静态方法，提高效率

  比如：工具类utils，Math类，Arrays类，Collections集合类

- 使用细节

  1. 类方法和普通方法都是**随着类的加载而加载**，将结构信息储存在方法区：类方法中无this的参数

  2. **类方法可以通过类名调用，也可以通过对象名调用**

  3. 普通方法和对象有关，需要通过对象名调用， 比如对象名.方法名（参数），不能通过类名调用

     ```java
     public static void main(String[] args){
       D.hi();
       new D().say();//通过对象名调用
     }
     
     class D {
       public void say(){
         //非静态方法
       }
       public static void hi(){
         //静态方法
       }
     }
     ```

  4. 类方法中不允许使用和对象有关的关键字，比如this和super，普通方法可以使用

     ```java
     public static void hi(){
       //类方法中不允许使用和对象有关的关键字
       //比如this和super。普通方法（成员方法）可以
       System.out.println((this.n1));//报错
      	//super也不能使用
     }
     ```

  5. **类方法中只能访问 静态变量 和静态方法。**

     ```java
     public static void hello(){
       //口诀：静态方法只能访问静态成员
       hi();//ok 		//hi()是静态方法
       say();//no ok //say()是静态变量
     }
     ```

  6. **普通成员方法，既可以访问 普通变量，也可以访问静态变量/方法（要遵循访问权限）**



### 8.2理解main方法

- 解释main方法的形式：`public static void main(String[] args){}`

1. **java虚拟机需要调用的main()方法**，所以该方法的访问权限必须是public

2. java虚拟机在执行main()方法时**不必创建对象**，所以该方法必须是static

3. 该方法接受String类型的数组参数，该数组中保存执行java命令时传递给所运行的类的参数

4. java 运行的类名 参数1 参数2 参数3

    <a href="https://sm.ms/image/DWrItUa6PVK1NfS" target="_blank"><img src="https://s2.loli.net/2023/12/01/DWrItUa6PVK1NfS.png" ></a>

   ```java
   public class Main01{
     private static String name = "name";
     private int n1 = 100;
     public static void hi(){
       System.out.println("Main01的hi方法");
     }
     public void cry(){
       System.out.println("Main01的cry方法");
     } 
     piblic static main(String[] args){
       //1.静态方法main 可以直接方法本类的静态成员
       System.out.println("name= " + name);
       hi();//可以访问  
       //2.静态方法main 不可以访问本类的非静态成员
       System.out.println("n1=" + n1);//错误
       cry();//不能访问
       //3.静态方法main 要访问本类的非静态成员，需要先创建对象，再调用即可
       Main01 main01 = new Main01();
       System.out.println(main01.n1)//ok
       main01.cry();
     }
   }
   ```





### 8.3代码块

- 介绍

  代码块又称为初始化块，属于类中的成员（是类的一部分)，类似于方法，将逻辑语句封装在方法体中，通过{}包围起来

  但和方法不同，没有方法名，没有返回，没有参数，只有方法体，而且不通过对象或者类显示调用，而是加载类时，或者创建对象时隐式调用

- 基本语法

  [修饰符]{

  ​	代码

  }；

- 注意

  1. 修饰符可选 ， 要么写static ，要么不写
  2. 代码块分为俩类，使用static修饰的叫静态代码块，没有static修饰的，叫普通代码块
  3. 逻辑语句可以为任何逻辑语句（输入，输出，方法调用，循环，判断等）
  4. 分号可以写上，也可以省略

  ```java
   public static void main(String[] args){
     Movie movie = new Movie("你好！李焕英！")；
   }
  class Movie {
    private String name;
    private double price;
    private String director;
    //1.下面的俩个构造器都有相同的语句
    //2.我们可以把相同的语句，放入到同一个代码块中
    //3.这样不管我们调用哪个构造器，创建对象，都会先调用代码块的内容
    //4.代码块的调用顺序优先于构造器 
    //所以有相同语句的 都可以放在代码块中
    {
      System.out.println("电影开始了！")
    }
    public Movie(String name){
      this.name = name;
    }
    public Movie(String name, double price){
      this.name = name;
      this.price = price;
    }
  }
  ```

- 好处

  1. 相当于另外一种形式的构造器，可以做初始化的操作
  2. 如果多个构造器中都有重复的语句，可以抽取到初始化块中，提高代码的重用性

- 注意事项

  1. static代码块也叫静态代码块，作用就是对类进行初始化，而且它随类的加载而执行，并且只会执行一次。如果是普通的代码块，每创建一个对象就执行。

  2. 类什么时候加载？

     1. **创建对象实例的时候，也就是new**
     2. **创建子类对象实例，父类也会被加载**
     3. **使用类的静态成员时（静态属性，静态方法）**

     ```java
     public class CodePatice {
       public static void main(String[] args) {
         //1.创建对象实例（new)
         AA aa =new AA();
         //AA!
         
         //2.创建子类对象的实例，子类的父类的也会被加载
         //父类先被加载，子类后被加载
         AA aa2 =new AA();
         //CC! AA!
         
         //3.使用类的静态成员时（静态属性，静态方法）
         System.out.println(BB.n1); 
         //BB! 9
     
       }
     }
     class AA{
     
       //静态代码块
       static {
         System.out.println("AA!");
       }
     }
     
     class BB{
       public static  int n1 = 9;
     
       //静态代码块
       static {
         System.out.println("BB!");
       }
     }
     
     class CC extends BB{
     
       //静态代码块
       static {
         System.out.println("CC!");
       }
     }
     ```

     

  3. 普通的代码块，在创建对象的实例时，会被隐式调用，被创建一次，就会调用一次。

     如果只是使用类的静态成员时，普通的代码块并不会执行

     ```java
     public class CodePatice {
         public static void main(String[] args) {
             System.out.println(DD.n1);
           //普通代码块，在new对象时，被调用，而且是每创建一个对象，就调用一次
           //普通代码块就是构造器的补充，如果构造器没有被调用，那么普通代码块就不会被调用
           //DD.n1是类加载，使用的是DD中的一个静态变量，并没有new一个对象，所以普通代码块并不会被调用 
           //DD的静态代码块!
           //8
         }
     }
     class DD{
         public static int n1 = 8;
     
         static {
             System.out.println("DD的静态代码块!");
         }
     
         {
             System.out.println("DD的普通代码块!");
         }
     }
     ```

     **static 代码块是类加载时执行，只会执行一次，普通代码块是在创建对象时候调用的，创建一次调用一次**
  
  4. 创建一个对象时，在一个类的调用顺序是：
  
     1. 调用静态代码块和静态属性初始化（静态代码块和静态属性初始化调用的优先级一样，如果有多个静态代码块和多个静态变量初始化，则按照他们的定义的顺序调用）
  
        ```JAVA
        class A {
          
          //静态属性的初始化
          private static int n1 = getN1();
          
          static {
            System.out.println("A的静态代码块01");
          }
          
          public static int getN1(){
            System.out.println("getN1被调用...");
            return 100;
          }
        }
        //输出为getN1被调用...  A的静态代码块01
        
        class A {
           static {
            System.out.println("A的静态代码块01");
          }
          
          //静态属性的初始化
          private static int n1 = getN1();
         
          public static int getN1(){
            System.out.println("getN1被调用...");
            return 100;
          }
        }
        //输出为 A的静态代码块01  getN1被调用...
        ```
  
     2. 调用普通代码块和普通属性的初始化（普通代码块和普通属性初始化调用的优先级一样，如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用）
  
        ```java
        class A {
          {
            //普通代码块
            System.out.println("A 的普通代码块01");
          }
          private int n2 = getN2();//普通属性的初始化
          
           static {
            System.out.println("A的静态代码块01");
          }
          
          //静态属性的初始化
          private static int n1 = getN1();
         
          public static int getN1(){
            System.out.println("getN1被调用...");
            return 100;
          }
          
          public int getN2(){
            System.out.println("getN2被调用");
          }
        }
        //输出为 A的静态代码块01  getN1被调用...  A的普通代码块01  getN2被调用.. 
        //静态代码块的优先级高于普通代码块的优先级
        ```
  
        
  
     3. 调用构造方法
  
        构造器的优先级最低
  
        最后调用构造器
  
        
  
  5. 构造方法（构造器）的最前面其实隐含了super（）和 调用普通代码块，属性初始化，在类加载时， 就执行完毕，因此是优先于 构造器和普通代码块执行的
  
     ```java
     //例子
     class A {
       public A (){
         //隐藏的要求
         //1.super();
         //2.调用本类的普通代码块
         System.out.println("ok");
       }
     }
     ```
  
     ```java
     class AAA{
       {
         System.out.println("AAA的普通代码块");
       }
       static {
         System.out.println("AAA的静态代码块");
       }
       public AAA() {
         //1.super();
         //2.调用本类的普通代码块
         System.out.println("AAA()的构造器被调用");
       }
     }
     class BBB extends AAA{
       {
         System.out.println("BBB的普通代码块");
       }
       static {
         System.out.println("BBB的静态代码块");
       }
       public BBB(){
         //1.super();
         //2.调用本类的普通代码块
         System.out.println("BBB()的构造器被调用");
       }
     }
     //AAA的静态代码块
     //BBB的静态代码块
     //AAA的普通代码块
     //AAA()的构造器被调用
     //BBB的普通代码块
     //BBB()的构造器被调用
     
     //父静-子静-父普-父构-子普-子构
     //调用顺序是，先调用本类的静态代码块，再去调用构造器，但是这个构造器是，先调用super(),再去调用本类的普通代码块，然后在往下执行
     ```
  
  6. 子类和父类调用静态或者非静态的类或者属性的顺序（优先级一样，按定义顺序执行）
  
     1. 父类的静态代码块和静态属性
     2. 子类的静态代码块和静态属性
     3. 父类的普通代码块和普通属性
     4. 父类的普通代码块和普通属性初始化
     5. 父类的构造方法（构造器）
     6. 子类的普通代码块和普通属性初始化
     7. 子类的构造方法（构造器）
  
     ```java
     public class CodeBlockDetail04 {
       public static void main(String[] args) {
         //(1) 进行类的加载
         //1.1 先加载 父类 A02 1.2 再加载 B02
         //(2) 创建对象
         //2.1 从子类的构造器开始
         //new B02();//对象
         new B02();
         new C02();
       }
     }
     
     class A02 { //父类
       private static int n1 = getVal01();
       static {
         System.out.println("A02的一个静态代码块..");//(2)
       }
       {
         System.out.println("A02的第一个普通代码块..");//(5)
       }
       public int n3 = getVal02();//普通属性的初始化
       public static int getVal01() {
         System.out.println("getVal01");//(1)
         return 10;
       }
     
       public int getVal02() {
         System.out.println("getVal02");//(6)
         return 10;
       }
     
       public A02() {//构造器
         //隐藏
         //super()
         //普通代码和普通属性的初始化......
         System.out.println("A02的构造器");//(7)
       }
     
     }
     
     class B02 extends A02 {
       private static int n3 = getVal03();
       static {
         System.out.println("B02的一个静态代码块..");//(4)
       }
       public int n5 = getVal04();
       {
         System.out.println("B02的第一个普通代码块..");//(9)
       }
     
       public static int getVal03() {
         System.out.println("getVal03");//(3)
         return 10;
       }
     
       public int getVal04() {
         System.out.println("getVal04");//(8)
         return 10;
       }
       public B02() {//构造器
         //隐藏了
         //super()
         //普通代码块和普通属性的初始化...
         System.out.println("B02的构造器");//(10)
         // TODO Auto-generated constructor stub
       }
     }
     ```
     
  7. 静态代码块只能调用静态成员，普通代码块可以调用任意成员
  
     ```java
     class C02 {
       private int n1 = 100;
       private static  int n2 = 200;
       private void m1() {
       }
       private static void m2() {
       }
     
       static {
         //静态代码块，只能调用静态成员
         //System.out.println(n1);错误
         System.out.println(n2);//ok
         //m1();//错误
         m2();
       }
       {
         //普通代码块，可以使用任意成员
         System.out.println(n1);
         System.out.println(n2);//ok
         m1();
         m2();
       }
     }
     ```
  
  
  ```java
  class Person {
      public static int total;//静态变量
      static {//静态代码块
          total = 100;
          System.out.println("in static block!");
      }
  }
  public class  Test{
      public static void main(String[] args) {
          System.out.println("total=" + Person.total);
          System.out.println("total=" + Person.total);
      }
  }
  //in static block
  //total = 100
  //total = 100
  ```
  
  ```java
  class Sample{
    Sample(String s){
      System.out.println(s);
    }
    Sample(){
      System.out.println("Sample默认构造器被调用");
    }
  }
  class Test{
    Sample sam1 = new Sample("sam1成员初始化");//3
    static Sample sam = new Sample("静态成员sam初始化");//1
    static {
      System.out.println("static块执行");//2
      if(sam == null){
        System.out.println("sam is null");
      }
    }
    Test(){
      //构造器
      //super（）
      //普通代码块和普通属性
      System.out.println("Test默认构造函数被调用");//4
    }
  }
  
  public static void main(String[] args) {
    Test a = new Test();//无参构造器
  }
  //先类加载
  
  //1.静态成员sam初始化
  //2.static块执行
  //3.sam1成员初始化
  //4.Test默认构造函数被调用  
  
  ```
  
- 

### 8.4单例设计模式(静态的使用)

- 什么是单例模式？

  单例（单个实例）

  1. 所谓的单例设计模式，就是采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例，并且该类只能提供一个取得其对象实例的方法。

  2. 单例模式有俩种方式：

     1）饿汉式：（只要类加载就创建了这个对象，你可能没有使用，但是只要类加载，就会有这个对象）

     坏处：创建了一个对象，但是没有使用
     
      ```java
      class GirlFriend {
        //如何保证我们只能创建一个GirlFriend对象
        //1.将构造器私有化
        //2.在类的内部直接创建
        //3.提供一个公共的static方法，返回gf对象
        private String name;
        //为了能够在静态方法中，返回gf对象，需要将其修饰为static
        private static GirlFriend gf = new GirlFriend("dick");
        private GirlFriend(String name){
          this.name = name;
        }
        public static GirlFriend getInstance(){
          return gf;
        }
      }
      public static void main (String[] args){
        GirlFriend intstance = GirlFriend.getInstance();
        System.out.println(instance);
      }
      ```
     
     2）痴汉式
     
     ```java
     class Cat {
       //1.对构造器进行私有化
       //2.定义一个static静态属性的对象
       //3.提供一个public的static方法，可以返回一个Cat对象
       //4.懒汉式只要使用getInstance时，才返回cat对象，
       //如果再次调用，还是会返回上一次创建的cat对象
       //从而保证了单例
       
       public  static  int n1 = 999;
       private static Cat cat;//初始化为null
       private  String name;//初始化name
       
       private Cat(String name){
         System.out.println("构造器被调用...");
         this.name = name;
       }
       public  static  Cat getInstance(){
         if(cat == null){
           cat = new Cat("小可爱");
         }
         return cat;
       }
     }
     
     ```
     
     两者的差别：
     
     1. 二者最主要的区别在于创建对象的时机不同：饿汉式是在类加载就创建了对象实例，而懒汉式是在使用时才创建。
     
     2. 饿汉式不存在线程安全，懒汉式存在线程安全问题
     
        （多线程的时候可能会出现同时去new这个对象，导致不是单例模式）
     
     3. 饿汉式存在浪费资源的可能，如果一个对象实例都没有使用，那么饿汉式创建的对象就浪费了，懒汉式是使用时才创建，就不会存在这个问题
     
     4. 在javaSE标准类中，java.lang.Runtime就是经典的单例模式



### 8.5final关键字

- final可以修饰类，属性，方法和局部变量

- 用到final情况：

  1. 当不希望类被继承时可以用final修饰

     ```JAVA
     final class A{}
     class B extends A{}//错误
     ```

  2. 当不希望父类的某个方法被子类覆盖/重写（override）时，可以用final关键字修饰

     ```java
     class C{
       public final void hi(){}
     }
     class D extends C {
       public void hi(){}//错误
     }
     ```

  3. 当不希望类的某个属性的值被修改，可以用final修饰

     `public final double TAX_RATE = 0.08;`

  4. 当不希望某个局部变量被修改时，可以使用final修饰

     `final double TAX_RATE = 0.08;`
  
- 使用细节

  1. final修饰的属性叫做常量，一般用XX_XX_XX来命名

  2. final修饰的属性在定义时，**必须赋值**，并且以后不能修改

     ①定义时    ②在构造器中  	③在代码块中

     ```java
     class AA {
       //1.定义时赋值
       public final double TAX_RATE = 0.08;
       public fianl double TAX_RATE2;
       public final double TAX_RATE3;
       
       public AA(){//构造器中赋值
         TAX_RATE2 = 0.03;
       }
       {//在代码块中赋值
         TAX_RATE3 = 0.4;
       }
     }
     ```

  3. 如果final修饰的属性是静态的，则初始化位置只能是

     ①定义时    ②在静态代码块  ③不能在构造器中赋值

      ```java
      class BB {
        //1.定义时
        public static final double TAX_RATE = 0.99;
        public static final double TAX_RATE2;
        public static final double TAX_RATE3;//错误
        //静态属性是在类加载时候就执行了，而构造器是new对象才执行，如果只加载没new对象，就可能导致没赋值成功。
        staic {
          TAX_RATE2 = 3.3
        }
        public BB(){
          TAX_RATE3 = 1.1;//错误
        }
      }
      ```

  4. final类不能继承，但可以实例化对象

  5. 如果不是final类，但是含有final方法，则该方法虽不能重写，但是可以被继承

  6. 如果一个类已经是final类了，就没有必要再将方法修饰成final方法

     ```java
     final class AA{
       public final void hi(){
         //加这个final没有意义
         //因为这个类已经final，所以不能被继承，这个方法也就不能被重写
       }
     }
     ```

  7. final不能修饰构造方法（构造器）

  8. final 和static 往往搭配使用，效率更高，不会导致类加载

     ```java
     class BB{
       public final static int num = 1000;
       static {
         System.out.println("BBB 静态代码块被执行")
       }
     }
     //当我想要去使用这个num但又不想让这个类加载，我们就需要去用final和static修饰，然后再去使用，就不会导致类加载
     ```

  9. 包装类（Integer，Double，Float，Boolean等都是final），String也是final类





### 8.6抽象类

当父类的一些方法不能确定时，可以用abstract关键字来修饰该方法，这个方法就是抽象方法，用abstract来修饰该类就是抽象类

```java
abstract class Animal{
  String name;
  int age;
  abstract public void cry();//这个cry类就是抽象类
}
```



- 介绍

  1. 用abstract关键字来修饰一个类时，这个类就叫抽象类

     `public abstrcat AAA{}`

  2. 用abstract关键字来修饰一个方法时，这个方法就是抽象方法

     `public abstract void BBB(String s);//没有方法体`

  3. 抽象类的价值在于设计，是先设计好后，让子类继承并且实现抽象类

  4. 抽象类，在框架和设计模式使用的较多

- 细节

  1. 抽象类不能实例化

     ```java
     public static void main(String[] args){
       new A();//错误，这就是实例化
     }
     abstract class A {
       
     }
     ```

  2. **抽象类不一定包含abstract方法，抽象类可以没有abstract方法**，可以有实现的方法

  3. **一旦有abstract方法，则这个类必须声明为abstract**

  4. **abstract只能修饰类和方法**，不能修饰属性和其他的

  5. 抽象类可以有任意成员（因为抽象类还是类）

  6. 抽象方法不能有主体，既不能实现如下

     `abstract void aaa(){//这里}//这个是错误的`

     `abstract void aaa();//这个是正确的`

  7. 如果一个类继承了抽象类，则它必须实现抽象类的所用抽象方法，除非它自己也声明为abstract类

     ```java
     abstract class E {
       public abstract void hi();
     }
     abstract class F extends E {
       
     }
     class G extends E {
       public void hi(){
         //这里相当于G子类实现了父类E的抽象方法
         //所谓实现方法，就是有方法体{}
       }
     }
     ```

  8. 抽象方法不能使用private，final和static来修饰，因为这些关键字都是和重写相违背的

- 模版设计模式

  ```java
  abstract class Template{
    //抽象类
    public abstract void job();//抽象方法
    public void caleTimes(){
  		//统计当前时间差ms
      long start = System.currentTimeMillis();
      job();
      long end = System.currentTimeMillis();
      System.out.println("耗时"+(end - start));
    }
  }
  //如果一个类继承了抽象类，则它必须实现抽象类的所用抽象方法，除非它自己也声明为abstract类
  class AA extends Template{
      @Override
      public void job() {
          for (int i = 0; i < 90; i++) {
              
          }
      }
  }
  ```





### 8.7接口

- 介绍

  接口就是给出一些没有实现的办法，封装到一起，到某个类要使用的时候，在根据具体情况把这些方法写出来

- 语法

  ```java
  interface 名字{
    //属性
    //方法
  }
  class 类名 implements 接口{
    属性；
      方法；
      //必须实现接口的抽象方法
  }
  ```

  ```java
  public interface UsbInterface{
       public void start();
       public void stop();
  }
  public class Camera implements UsbInterface{
      @Override
      public void start() {
          System.out.println("开始工作！ ");
      }
  
      @Override
      public void stop() {
          System.out.println("停止工作！");
      }
  }
  public class Computer {
      public void work(UsbInterface usbInterface){
          usbInterface.start();
          usbInterface.stop();
      }
  }
  
  public class Interface1 {
      public static void main(String[] args) {
          Camera camera = new Camera();
          Computer computer = new Computer();
          computer.work(camera);//使用接口
          System.out.println("----------");
  
      }
  }
  ```

  1. 在JDK7前，接口里所有方法都没有方法体，既都是抽象方法

  2. JDK8后的接口口可以有静态方法，默认方法，也就是接口中可以有方法的具体实现

     ```java
     default public void ok(){
       System.out.println("ok");
     } 
     ```

- 注意事项和使用细节

  1. 接口不能实例化`new IA();//这是实例化`

  2. 接口中所用的方法是public方法，接口中抽象方法，可以不用abstract修饰

     `void aaa();`=`abstract void aa();`

  3. 一个普通类实现接口，就必须将该接口的所用方法都实现

  4. 抽象类实现接口，可以不用实现接口的方法（本身是抽象类）（可以不实现）
  
  5. 一个类同时可以实现多个接口
  
     ```java
     interface IB{}
     interface IC{}
     class A implements IB,IC{
       
     }
     ```
  
  6. 接口中的属性，只能是final的，而且是public static final 修饰符
  
     ```java
     interface IB{
       int n1 = 10; //等于 public static final int n1 = 10;
     }
     ```
  
  7.  接口中属性的访问形式：接口名.属性名
  
     ```java
     public static void main(String[] args){
       IB.n1;//调用属性
     }
     ```
  
  8. 一个接口不能继承其他的类，但是可以继承多个别的接口
  
     ```java
     interface A extends B,C{}//可以继承多个别的接口
     ```
  
  9. 接口的修饰符 只能是public和默认，这点和类的修饰符是一样的
  
- 接口和继承类的不同

  1. 继承在于解决代码的复用性和可维护性
  2. 接口在于设计好各种规范方法，让其他类去实现这些方法
  3. 接口比继承更加灵活，继承是满足is-a的关系，而接口只需要满足like-a的关系
  4. 接口在一定程度上实现代码的解耦（接口规范性+动态绑定机制）

- 接口的多态性

  1. 多态参数

     前面的UsbInterface usbinterface,既可以接受手机对象，又可以接受相机对象，就体现了接口 多态（接口引用可以指向实现了接口的类的对象）

     ```java
     public static void main(String[] args){
       //接口的多态体系
       //接口类型的变量 if01 可以指向 实现了IF接口的对象实例
       IF if01 = new Monster();
       if01 = new Car();
     }
     interface IF{}
     class Monster implements IF{}
     class Car implements IF{}
     ```

  2. 多态数组

     ```java
     public static void main(String[] args){
       //多态数组->接口类型数组
       
       Usb[] usbs = new Usb[2];
       usbs[0] = new Phone();
       usbs[1] = new Camera();
     }
     interface Usb{}
     class Phone implements Usb{}
     class Camera implements Usb{}
     ```

  3. 多态传递

     ```java
     public static void main(String[] args){
       //IG继承了IH的接口，而Teache类实现的对象实例
       //IG继承了IH接口，而Teache类实现了IG接口
       //相当于Teacher类也实现了IH接口
       
       IH ih = new Teacher();
       IG ig = new Teacher();
     }
     interface IH{}
     interface IG extends IH{}
     class Teacher implements IG{}
     ```

     ```JAVA
     interface A{
     	int x = 1;//=public static final int x = 1;
     }
     class B{
       int x = 0;
     }
     
     class C extends B implements A{
       public void pX(){
         //可以通过指定X去实现调用这俩个不同的X
         //访问接口的X就使用A.x
         //访问父类的X就使用super.x
         System.out.println(A.X + " " + super.x)
       }
       public static void main(String[] args){
         new C().pX();
       }
     }
     ```
     
     



### 8.8内部类

- 基本介绍

  一个类的内部又完整的嵌套了另一个类结构。被嵌套的称为内部类（inner class)，嵌套的其他类的类称为外部类（outer class).是我们类的第五大成员，内部类最大的特点就是直接访问私有属性，并且可以体系类与类之间包含的关系

  **类的五大成员：属性，方法，构造器，代码块，内部类**

- 基本语法

  ```java
  class Outer{
    //外部类
    class Inner{
      //内部类
    }
  }
  class Other{
    //外部其他类
  }
  ```

   ```java
   public class innerclass01 {
       public static void main(String[] args) {
   
       }
       class Outer{
           //代码块
           {
               System.out.println("代码块");
           }
           private static int x = 1;//私有属性
           class Inner{
               //内部类
                
           }
       }
   }
   ```

- 内部类的分类

  1. 定义在外部局部位置上（在方法内）：
     1. 局部内部类（有类名）
     2. **匿名内部类（没有类名）**
  2. 定义在外部类的成员位置上：
     1. 成员内部类（没用static修饰）
     2. 静态内部类（使用static修饰）

- 局部内部类的使用（定义在外部类的局部位置，比如在方法中，并且有类名）

  ```java
  class Outer{
    //外部类
    private int n1 = 100;
    public void m1(){
      //方法
      //局部内部类是定义在外部类的局部位置，通常在方法
      class Inner{
        //局部内部类
      }
    }
  }
  ```

  1. 可以直接访问外部类的所有成员，包含私有的

     ```java
     class Outer{
       //外部类
       private int n1 = 100;
       private void m2(){}
       public void m1(){
         class Inner{
           //局部内部类
           public void f1(){
             System.out.println("n1=" + n1);
             //直接访问外部类的私有属性的成员
             m2();//还可以直接访问外部类的私有方法
           }
         }
       }
     }
     ```

  2. 不能添加访问修饰符，因为它的地位就是一个局部变量，局部变量是不能使用修饰符的，但是可以使用final修饰，因为局部变量也可以使用final

     ```java
     class Outer{
       class Inner1{
       }
       class Inner2 extends Inner1{//没有final修饰的可以直接继承
       }
       final class Inner3{
       }
       class Inner4 extends Inner3{}//final修饰的类不能被继承
     }
     ```

  3. 作用域，仅仅在定义它的方法或者代码块中

     ```java
     class Outer{
       public void m1(){
     		String name = "sad";//作用域只在m1方法内
         class Inner{
           //作用域也只在m1方法内
         }
         {
     			class Inner2{
             // 这个样内部类的作用域在这个代码块中
           }
         }
     	}
     }
     ```

  4. 局部内部类可以直接访问外部类的成员

  5.   **外部类在方法中，直接创建Inner对象，然后调用方法即可**

     ```java
     class Outer{
       public void m1(){
         class Inner{
           public void f1(){
     				System.out.println(n1);
           } 
         }
       	Inner ineer = new Inner();//在外部类创建好Inner对象
         inner.f1();//然后再调用里面的对象
       }
     }
     ```

  6. 外部其他类不能直接访问局部内部类（局部内部类地位是一个局部变量）

  7. 如果外部类和局部内部类的成员重名时，默认**遵循就近原则**，如果想访问外部类的成员，则可以使用（外部类名.this.成员）去访问

     ```java
     class Outer{
       private int n1 = 100;
       class Inner{
         private int n1 = 200;
         System.out.println(n1);//这里输出的200，根据就近原则
         System.out.println(Outer.this.n1);//访问外部类的n1
         //Outer.this本质就是外部类的对象，哪个对象调用m1，Outer.this就是哪个对象
         //这里的Outer.this就是指定Outer
       }
     }
     ```

- **匿名内部类的使用**

  1.本质是类 2.内部类 3.没有名字 4.还是一个对象

  定义：匿名内部类是定义在外部类的局部位置，比如方法中，并且没有类名（这个类名不是自己取得，而是系统取得)

  ```java
  class Outer{
    interface IA{
      public void cry();
    }
    //编译类型看等号左边，这个tiger的编译类型就是IA
    //tiger的运行类型就是这个匿名内部类
    //这个匿名内部类的名字就是Outer$1
    //JDK底层在创建匿名内部类Outer$1，立即就马上创建了Outer$1实例，并且把地址返回给tiger
    //匿名内部类使用一次，就不能再使用了
    //但可以反复调用
    IA tiger = new IA(){
      public void cry(){
        System.out.println("老虎...")；
      }
    };//分号不能丢
  
  
  
    //基于类的匿名内部类
    Father father = new Father("Jack"){
      //这个Jack传给了Father的构造器，并调用了这个构造器
  
      //重写test方法
      public void test(){
        System.out.println("匿名内部类重写test方法")；
      }
    };
    father.test();//在调用test方法，就是father里面重写的test方法
    //这个father的匿名内部类的名字就是Outer$2，后面的匿名内部类以此类推
    class Father{
      //类
      public Father(String name){
        //构造器
      }
      public void test(){
        //方法
      }
    }
  
  
    //基于抽象类的匿名内部类
    abstract class Animal{
      //抽象类
      abstract void eat();
    }
    //抽象类的方法必须实现
    Aniaml animal = new Animal(){
      void eat(){
        System.out.println("eating...");
      }
    };//切记必须加分号
  }
  ```

- 使用细节

  匿名内部类既是一个类的定义，也是一个对象，从语法上看，既有定义类的特征，也有创建对象的特征

  ```java
  Person person =new Person(){
    public void hi(){} 
  };
  person.hi();//调用hi方法
  
  //直接调用，匿名内部类本身也是返回对象
  new Person(){
    public void hi(){}
  }.hi();
  ```

- 实践

  ```JAVA
  public static void f1(IL il){
    il.show();
  }//静态方法，形参是接口类型 
  interface IL{
    void show();
  }
  
  public static void main(String[] args){
    f1(new IL(){
      public void show(){
        System.out.println("111"); 
      }
    });//语句需要分号结尾
  }
  ```

  ```JAVA
  public class Innerclass02 {
    interface Bell {
      void ring();
    }
  
    class Cellphone {
      public void alarmclock(Bell bell) {
        bell.ring();
      }
    }
  
    public void main(String[] args) {
      Cellphone cellphone = new Cellphone();
      cellphone.alarmclock(new Bell() {
        @Override
        public void ring() {
  
        }
      });
    }
  }
  ```

- 成员内部类的使用

  1. 可以直接访问外部类的所有成员，包含私有的

     ```java
     class Outer{
       private int n1 = 10;
       public String name = "dick";
       //成员内部类是定义在外部内的成员位置上
       class Inner{
         //成员内部类
         public void say(){
           //可以直接访问外部类的所有成员，包含私有的
           System.out.println(n1+name);
     
         }
         public void t1(){
           Inner inner = new Inner();
           inner.say(); 
         }
       }
     }
     ```

  2. 可以添加任意访问修饰符，本身就是一个成员

  3. 作用域和外部成员一样，为整个类体

  4. 成员内部类访问外部类成员直接访问

  5. 外部类访问成员内部类，先创建对象，再访问

  6. 外部其他类访问成员内部类

     ```java
     public static void main(String[] args){
       Outer outer = new Outer();
       
       //外部其他类，使用成员内部类的三种方式 
       Outer.Inner inner = outer.new Inner();
       //Outer.new Inner(); 相当于把 new Inner()当做是outer成员
       
       //在外部类中，编写一个方法，返回Inner对象
       Outer.Inner innerInstance = outer.getInnerInstance();
       innerInstance.say();
     }
     
     class Outer{
       class Inner{
         public void say(){
           System.out.println("1");
         }
       }
       public Inner getInnerInstance(){
         return new Inner();
       }
     }
     ```

  7. 外部类和内部类的成员重名，内部类访问遵循就近原则，如果想访问外部类成员，可以使用（外部类.this.成员）去访问

- 静态内部类的使用

  1. 可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员

  2. 可以直接添加任意访问修饰符，本身还是一个类

  3. 作用域，以此类推

  4. 静态内部类访问外部类，直接访问所用的静态成员

     ```java
     class Outer{
       private int n1 = 10;
       private static String name = "jack";
       static class Inner{
     
       }
     }
     ```

  5. 外部类访问静态内部类，先创建，再访问 

     ```java
     class Outer{
       public static class Inner{
         public void say(){
     
         }
       }
       public Inner1 getInner1(){
         return new Inner();
       }
       public static Inner getInne2r(){
         return new Inner();
       }
     }
     public static void main(String[] args){
       //方法1
       Outer.Inner inner = new Outer.Inner();
       inner.say();
       //方法2
       Outer.Inner inner1 = outer.getInner1(); 
       inner1.say();
       Outer.Inner inner2 = Outer.getInner2();
       inner2.say();
     }
     ```

  6. 外部类和静态内部类的成员重名时，静态内部类访问时，遵循就近原则，想要访问外部类的成员时，则可以使用（外部类.成员）去访问



[^12-28-2023]:









## 9.枚举和注解

### 9.1.枚举

- 自定义枚举

  1. 不需要提供setXXX方法，枚举对象通常为只读

  2. 对枚举对象/属性使用final+static共同修饰，实现底层优化

  3. 枚举对象名通常使用全部大写，常量的命名规范

  4. 枚举对象根据需要，也可以有多个属性

     ```java
     class Season{
       private String name;//名称
       private String desc;//描述
       public String getName(){
         return name;
       }
       public String getDesc(){
         return desc;
       }
       private Season(String name,String desc){
     		this.name = name;
         this.desc = desc;
       }
       public final static Season SPRING = new Season("spring","good");
       public final static Season SUMMER = new Season("summer","good");
       public final static Season AUTUMN = new Season("autumn","good");
       public final static Season WINTER = new Season("winter","good");
     }
     ```

  5. 自定义实现枚举有以下特点：

     1. 构造器**私有化**
     2. 本类内部创建一组对象
     3. 对外暴露对象（对对象添加public final static 修饰符）
     4. 提供get方法，但不提供set方法

- 使用enum关键字实现枚举

  ```java
  enum Season{
    //public final static Season SPRING = new Season("spring","good");
    //使用枚举enum，因此代码可以简化成如下形式
    SPRING("spring","good"),
    SUMMER("summer","good"),
    AUTUMN("autumn","good"),
    WINTER("winter","good");
    //每个枚举之间用逗号隔开，不能用分号
    //并且枚举常量要放在最前面，否则不符合语法形式
  	//public final static Season SPRING = new Season("spring","good");
    //上面这一堆代码等价于SPRING("sprng","good");
    //相当于简化了，但是还是final static修饰的常量
    private String name;//名称
    private String desc;//描述
    public String getName(){
      return name;
    }
    public String getDesc(){
      return desc;
    }
    private Season(String name,String desc){
      this.name = name;
      this.desc = desc;
    } 
  }
  ```

- 注意事项

  1. 当我们使用enum关键字开发一个枚举时，默认**继承Enum类**
  2. 如果使用无参构造器 创建枚举对象，则**实参列表和小括号都可以省略**
  3. 当有多个枚举对象时，**使用逗号间隔，最后有一个分号结尾**
  4. 枚举对象**必须放在枚举类的行首**

- enum常用方法应用实例

  1. toString:Enum类已经重写过了，返回的是当前对象名，子类可以重写该方法，用于返回对象的属性信息
  2. name：返回当前对象名（常量名），**子类中不能重写**
  3. ordinal:返回当前枚举中所用的常量
  4. valueOf：将字符串转换为枚举对象，要求字符串必须为已有常量名，否则报错
  5. values：返回当前枚举类中所有的常量
  6. comparTo：比较俩个枚举常量，比较的是位置号  

  ```java
  public class Enumexecise01 {
    enum Week{
      MONDAY("1"),
      TUESDAY("2"),
      WEDNESDAY("3"),
      THURSDAY("4"),
      FRIDAY("5"),
      SATURDAY("6"),
      SUNDAY("7");
      private String name;
      public String getName() {
        return name;
      }
      @Override
      public String toString() {
        return "name='" + name;
      }
      private Week(String name){
        this.name = name;
      }
    }
    public static void main(String[] args) {
      for (Week week : Week.values()) {
        System.out.println(week);
      }
  
    }
  }
  ```

- 细节

  1. 使用enum关键字后，就不能再继承其他类了，因为enum会隐式继承enum，而java是单继承机制

  2. 枚举类和普通类一样，可以实现接口

     `enum 类名 implements 接口1，接口2{}`



### 9.2.注解

- 注解介绍

  1. 使用Annotation时要在其前面增加@符号，并把该Annotation当成一个修饰符使用，用于修饰它支持的程序元素

  2. @Override:限定某个方法，是重写父类方法，该注解只能用于方法

     ```java
     class Father{
       public void fly(){
         System.out.println("Father fly");
       }
     }
     class Son extends Father{
       @Override 
       //@Override 注解放在fly方法上，表示子类的fly方法时重写了父类的fly
       //这里如果没有重写@Override 还是重写了父类的fly
       //如果写了@Override注解 编译器就会去检查该方法是否真的重写了父类的方法
       //如果的确重写了，则编译通过，如果没有构成重写，则编译错误
       public void fly(){
         System.out.println("Son fly");
       }
       //@interface不是interface，而是注解
     }
     ```

     

     1. @Override表示指定重写父类的方法，如果父类没有这个方法则会报错
     2. 如果不写@Override注解，而父类仍有这个方法，也构成重写
     3. @Override只能修饰方法，不能修饰其他类，包，属性等
     4. 查看@Override注解源码为@Target（ElementType.METHOD),只能修饰方法
     5. @Target是修饰注解的注解，被称为元注解

  3. @Deprecated:用于表示某个程序元素（类，方法等）已经过时

     ```java
     public static void main(String[] args){
       A a = new A();
       a.hi();
       System.out.println(a.n1);
     }
     //@Deprecated修饰某个元素，表示该元素已经过时
     //既不在推荐使用，但是仍然可以使用
     @Deprecated
     class A {
     	@Deprecated
       public int n1 = 10;
       @Deprecated
       public void hi(){
         
       }
     }
     ```

     1. 用于表示某个程序元素（类，方法等）已过时
     2. 可以修饰方法，类，字段，包，参数等等
     3. @Tatget(value = {CONSTRUCTOR,FILED,LOCAL_VARIABLE,METHOD,PACKAGE,PARAMETER,TYPE})
     4. @Deprecated的作用可以做到新旧版本的兼容和过度

  4. @SuppressWarnings:抑制编译器警告

     1. unchecked是忽略没有检查的警告
     2. rawtypes是忽略没有指定泛型的警告
     3. unused是忽略没有使用某个变量的警告错误
     4. @SuppressWarning 可以修饰的程序元素为，查看@Target
     5. 生成@SupperssWarnings时，不用背，直接点击左侧的黄色提示，就可以选择



### 9.3.JDK的元注解

- JDK的元注解用于修饰其他的注解
- 种类
  1. Retention 指定注解的作用范围，三种SOURCE,CLASS,RUNTIME
     1. RetentionPolicy.SOURCE:编译器使用后，直接丢弃这种策略的注释
     2. RetentionPolicy.CLASS:编译器将把注释记录在class文件中，当运行java程序时，jvm不会保留注释，这是默认值
     3. RetentionPolicy.RUNTIME:编译器将把注解记录在class 文件中，当运行java程序时，JVM会保留注解，程序可以通过反射获取该注解
  2. Target 指定注解可以使用在哪些地方
  3. Documented 指定该注解是否会在javadoc体现
  4. Inherited 子类会继承父类的注解





## 10.异常

### 10.1.异常

- 概念

  在JAVA语言中，将程序发生的不正常的行为被称为“异常”

- 俩类异常

  1. Error（错误）：java虚拟机无法解决的严重问题
  2. Exception：其他因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性代码进行处理，例如：空指针访问。分为俩大类：运行时异常和编译时异常



### 10.2.异常体系图

1. 异常分为俩大类，运行时异常和编译时异常
2. 运行时异常，编译器不要求强制处置的异常，一般是指编程的逻辑错误，是程序员应该避免其出现的异常，java.lang.RuntimeException类及它的子类都是运行时异常
3. 对于运行时异常，可以不做处理，因为这类异常很普遍，若全处理可能会对程序的可读性和运行效率产生影响
4. 编译时异常，是编译器要求必须处置的异常



### 10.3.常见时运行时异常

1. NullPointException空指针异常
2. ArithmeticException数字运算异常
3. ArrayIndexOutOfBoundsException数组下标越界异常
4. ClassCastException类型转换异常
5. NumberFormatException数字格式不正确异常



### 10.4.异常处理

- 异常处理就是当异常发生时，对异常处理的方式

- 处理的方式

  1. try-catch-finally

     程序员在代码中捕获发生的异常，自行处理

     ```java
     try{
     //代码,可能异常的代码
     }catch(Exception e){
     //当异常发生时
       //系统将异常封装成Exception对象e，传递给catch
       //得到异常对象后，程序员，自己处理
       //没有发生异常，这个catch代码块不执行
      }finall{
       //不管try代码块是否有异常发生，始终要执行finally
     }
     ```

  2. throws将发生的异常抛出，交给调用者来处理，最顶级的处理者就是JVM

     <a href="https://smms.app/image/J174qrFY8LythW5" target="_blank"><img src="https://s2.loli.net/2023/12/29/J174qrFY8LythW5.png" ></a>

     f2方法抛给f1方法，f1方法有俩种选择，一是选择使用try-catch-finally,二是选择再扔给上一级，依次类推，到了JVM机时，就直接输出异常了，然后退出程序

     ```java
     public static void main(String[] args) throw Exception{
     //如果程序员没有显示处理异常，默认throws
       //
     }
     ```

     



### 10.5.try-catch异常处理

- try-catch方式异常处理说明

  1. try块用于包含可能出错的代码，catch块用于处理try块中发生的异常，可以根据需要在程序中有多个数量的try…catch块

  2. 基本语法

     ```java
     try{
       //可疑代码
       //将异常生成对应的异常对象，传递给catch块
     }catch{
       //对异常的处理
     }
     ```

- 注意事项

  1. 如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块

  2. 如果异常没有发生，则顺序执行try的代码块，不会进入到catch

  3. 如果希望不管是否发生，都执行某段代码，比如关闭连接，释放资源等，使用finally{}

  4. 可以有多个catch语言，捕获不同的异常（进行不同的业务处理），要求父类异常在后，子类异常在前，比如(Exception在后，NullPointException在前)，如果异常发生只会匹配一个catch

     ```java
     try{
       Person person = new Person();
       person = null;
       System.out.println(person.getName());
       int n1 = 10;
       int n2 =0;
       int res= n1/n2;
     }catch(NullPointException e){
       System.out.println("空指针异常" + e.getMessage());
     }catch(ArithmeticException e){
       System.out.println("算术异常"+ e.getMessage());
     }catch(Exception e){
       //
     }finally{
       //
     }
     ```

  5. 可以进行try-finally配合使用，这种用法相当于 没有捕获异常，因此程序会直接崩掉，执行一段代码，不管是否发生，都必须执行某个业务



### 10.6.throws异常处理

- 介绍

  1. 如果一个方法可能生成某种异常，但是不能确定如何处理这些异常，则此方法应显示地声明抛出异常，表明该方法将不对这些异常进行处理，而由该方法的调用者负责处理
  2. 在方法声明中用throws语句可以声明，抛出异常的列表，throws后面的异常类型可以是方法中产生的异常类型，也可以是它的父类

- 注意事项和使用细节

  1. 对于编译异常，程序中必须处理，比如：try-catch，throws

  2. 对于运行时异常，程序中如果没有处理，默认就是throws的方式处理

  3. 子类重写父类的方法时，对抛出异常的规定：子类重写的方法，所抛出的异常的类型要么和父类抛出的异常一致，要么为父类抛出的异常的类型的子类型

     ```java
     class Father{
       public void method() throws RuntimeException{
     
       }
     }
     class Son extends Father{
       @Override
       public void methos() throws NullPointException{
       //所抛出的异常的类型要么和父类抛出的异常一致，要么为父类抛出的异常的类型的子类型
       }
     }
     ```

  4. 在throws过程中，如果有方法 try-catch，就相当于处理异常，可以不必throws

     ```java
     public static void f1(){
       //f3()抛出的是一个编译异常
       //这时，就要f1()必须处理这个编译异常
       //在f1()中，要么try-catch-finall，或者继续throws这个编译异常
       f3();//抛出异常
     }
     public static void f3() throws FileNotFoundException{
     	FileInputStream fis = new FileInputStream("d://aa.txt");
     }
     ```

     **编译异常必须处理，运行异常可以不处理**



### 10.7.自定义异常

- 概念

  当程序中出现某些错误，但该错误信息并没有在Throwable子类中描述处理，这时候可以自己设计异常类，用于描述该错误信息

- 步骤

  1. 定义类：自定义异常类名，然后去继承Exception或者RuntimeException
  2. 如果继承Exception,属于编译异常
  3. 如果继承RuntimeException属于运行异常（一般来说，应该继承RuntimeException)

  ```java
  public class CustomException{
    public static void main(String[] args){
      int age = 180;
      if(!(age >= 18 && age <=120)){
        throw new AgeException("年龄需要在18~120之间")；
      }
      System.out.println("你的年龄范围正确")；
    }
  }
  class AgeException extends Exception{
    public AgeException(String message){
      super(message);
    }
  }
  ```

  |        |           意义           | 位置       | 后面跟的东西 |
  | :----: | :----------------------: | ---------- | ------------ |
  | throws |    异常处理的一种方式    | 方法声明处 | 异常类型     |
  | throw  | 手动生成异常对象的关键字 | 方法体中   | 异常对象     |





## 11.常用类

### 11.1.包装类

<a href="https://smms.app/image/QB14rFYIHkbA6Zz" target="_blank"><img src="https://s2.loli.net/2023/12/29/QB14rFYIHkbA6Zz.png" ></a>

```java
int n1 = 100;
//在JDK5之前是手动装箱和拆箱
Integer integer = new Integer(n1);
Integer integer1 = Integer.valueOf(n1);
//手动拆箱
int i = integer.intValuer();
//在JDK5后可以实现自动装箱和自动拆箱
int n2 =200;
//自动装箱
Integer integet2 = n2;
//自动拆箱
int n3 = integer2;
//底层仍然是使用intValue()方法
```

- 包装类和String类型的相互转换

  ```JAVA
  //包装类(Integer)->String
  Integer i = 100;
  String str1 = i+ "";
  String str2 = i.toString();
  String str3 = String.value0f(i);
  //String->Integer
  String str4 ="12345";
  Integer i2 = Ingeter.parseInt(str4);//自动装箱
  //自动装箱只能是基本数据类型使用，String不是基本数据类型
  Integer i3 = new Integer(str4);
  ```

  ```java
  Integer i = new Integer(1);
  Integer j = new Integer(1);
  System.out.println(i == j);//False
  //==是比较这俩个是否为同一对象不是，而不是值相等
  Integer m = 1;
  Integer n = 1;//Integet.valueOf(1)
  System.out.println(m == n);//True
  //阅读源码
  //看范围 -128~127 就直接返回赋值的这个数
  //否则就 new Integer(XX);
  Integer x =128;
  Integer y =128;//Integer.valueOf(128);
  System.out.println(x == y);//false
  
  //Integer.valueOf()的源码
  public static Integer valueOf(int i) {
    //-128~127
    if (i >= IntegerCache.low && i <= IntegerCache.high)
      return IntegerCache.cache[i + (-IntegerCache.low)];//返回原来赋的值
    return new Integer(i);//new了一个新对象
  }
  ```

  ```java
  //例题
  Integer i11 = 127;
  int i12 = 127;
  //只要有基本数据类型判断都是值是否相等
  //如果用==去判断
  i11 == i12;//TRUE
  ```
  
  **有基本数据类型，判断==就是判断值是否相等**





### 11.2.String类

- String 的介绍

  1. String对象用于保存字符串，也就是一组字符序列

  2. 字符串常量对象是用双引号括起来的字符序列，例如：“你好”等

  3. 字符串的字符使用Unicode字符编码，**一个字符无论是字母还是汉字都占俩个字节**

  4. **String是final类**，不能被继承,赋值后不能被修改（地址不可被修改，不是字符不能被修改），**也就是这个value[] 不能指向另外一个空间的地址，这个地址不能更改**，可以把这个地址指向的里面的字符改变

  5. **value不能指向新的地址，但是单个字符的内容可以变化**

     ```java
     //例如
     final char[] value = {'a','b','c'};
     value[0] = 'H';
     //编译正常运行
     ```

  6.  字符串本类还是char数组`private final char value[]`

  7. String类实现了接口Serializable(String可以实现串行化，可以在网络传输，还实现接口Comparable（String对象可以比较大小）)

  8. String还有许多的构造器

     `String s1 = new String();`

     `String s2 =new String(String original);`

     `String s3 = new String(char[] a);`

     `String s4 = new String(char[] a , int startIndex,int count);`

     `String s5= new String(byte[] b);`

- 创建String的俩种方式

  1. 直接赋值

     `String s = "asdff"; `

     先从常量池查看是否有‘’asdff‘’的数据空间，如果有，直接指向，如果没有则重新创建，然后再指向，s最终指向的是常量池的空间地址

  2. 调用构造器

     `String s = new String("asdff");`

- String.intern() 的使用

  当调用intern方法时，如果池已经包含一个等于此String对象的字符串（用equal（0bject)方法确定），则返回池中的字符串，否则，将此String对象添加到池中，并**返回此String对象的引用（地址）**

  **其实这个方法最终返回的是常量池的地址**

  ```java
  String a = "asd";//a指向常量池的对象
  String b = new String("asd");//b指向堆中的对象
  //a->"asd"  b->value->"asd"
  System.out.println(a.equals(b));//T
  System.out.println(a==b);//F
  System.out.println(a==b.intern());//T
  System.out.println(b==b.intern());//F
  //b是指向value的地址，而a是指向“asd”的地址，这俩个地址比较一定不同
  ```

- 字符串的特性

  ```java
  String s1 = "hello";
  s1 = "haha";
  //s1先去找常量池有没有hello
  //如果没有就创建一个
  //s1 = “haha”是再去常量池中寻找有没有haha
  //如果有直接指向
  //如果没有再创建一个haha，然后再指向这个haha
  ```

  ```java
  String a = "hello" + "abc";
  //编译器在底层创建时，并不会创建hell和abc和helloabc这三个对象
  //它会进行优化，然后直接生成helloabc这一个对象
  ```

  ```java
  String a = "hello";
  String b = "abc";
  String c = a + b;
  //创建了三个对象
  //String c1 = "ab" + "cd";常量相加，看的是常量池
  //String c1 = a + b;变量相加，是在堆中
  ```

  <a href="https://smms.app/image/dg73afHRrcGI1sA" target="_blank"><img src="https://s2.loli.net/2024/01/01/dg73afHRrcGI1sA.png" >d </a>

- String方法的使用

  ```java
  
  //equals 比较是内容相同，并且区分大小写
  String str1 = "hello";
  String str2 = "HEllo";
  System.out.println(str1.equals(str2));//F
  
  //equalsIgnoreCase忽略大小写判断内容是否相同
  String usename = "dick";
  "dick".equalsIgnoreCase(username);//T
  
  //length 获取字符串的长度
  
  //indexOf 获取字符在字符串对象中第一次出现的索引
  //索引从0开始，如果找不到就返回-1
  String s1 = "hello";
  int index = s1.indexOf('e');
  int index = s1.indexOf("e");
  
  
  //latsIndexOf 获取字符在字符串中最后一次出现的索引，
  //索引从0开始，如果找不到就返回-1 
  String s1 = "hello";
  int index = s1.lastIndexOf('e');
  
  //substring 截取指定范围的子串
  String name = "hello";
  name.substring(3);//截取后面的字符.从3开始截取后面的字符
  //
  name.substring(0,5);//表示从索引0开始截取，截取到5-1个字符
  //hell
  
  ```
  
  ```java
  //toUpperCase转换大写
  String s1 = "hi";
  System.out.println(s.toUpperCase());//HI
  
  //toLowerCase转换小写
  "HI".toLowerCase();//hi
  
  //concat
  String s1 = "hi"
  s1 = s1.conct("nihao").concat("nihao")
  //hinihaonihao
    
  //replace替换字符串中的字符
  String s1 = "dick and cock";
  String s11 = s1.replace("dick","cock");
  System.out.println(s1);//dick and cock
  System.out.println(s11);//cock and cock
  
  //spilt分割字符串 对于一些字符串 我们需要转义字符 | \\
  String str1 = "sadsa,asddsa,asdas";
  String[] spilt = str1.split(",");
  //对str1进行分割，返回一个数组
  //在对字符串进行分割时，如果有特殊字符，需要加入转义字符
  str1 ="e:\\aaa\\bbb";
  split = str1.split("\\\\");
  //e:  aaa  bbb
  
  //toCharArray 转化为字符数组
  s = "happy";
  char[] chs = s.toCharArray();
  //h a p p y
  
  //compareTo比较俩个字符串的大小，如果前者大，返回正数，否则返回负数，相等返回0
  String a = "jack";
  String b = "jaca";
  System.out.println(a.compareTo(b));
  //返回是k的ascii码值减去a的ascii码值的值
  
  //formate格式字符串
  //%s 字符串 %c字符 %d 整型 %.2f浮点型
  String name = "dick";
  int age = 10;
  String info = "我的姓名是"+name+"年龄是"+age;
  //这些占位符是由后面的变量来替换
  String info1 =String.format("我的姓名是%s年龄是%d")；
  ```
  
  ```java
  package ArraysExercise;
  
  public class HomeWork9 {
    public static void main(String[] args) {
      String str  = "abcdefg";
      System.out.println();
      str = reverse(str, 0, 6);
      System.out.println(str);
    }
    public static String reverse(String str,int start,int end){
  
      String s  = "";
      char temp = ' ';
      char[] chars = str.toCharArray();//转化为数组
      for (int i = start,j=end;i<j ; i++) {
        temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        start++;
        end--;
        if( end < start){
          break;
        }
      }
      return new String(chars);
    }
  
  }
  
  ```
  
   





### 11.3.StringBuffer类

- 概念

  java.lang.StringBuffer代表可变的字符序列，可以对字符串内容进行增删

  很多方法与String相同，但StringBuffer是可变长度的

  StringBuffer是一个容器

- 解读StringBuffer

  1. StringBuffer的直接父类是AbstractStringBuilder
  2. StringBuffer实现了Serialzable,既StringBuffer的对象是可以串行化
  3. 在父类中AbstractStringBuilder有属性char[] value,不是final，该value数组存放字符串内容，引出存放在堆中的
  4. StringBuffer是一个final类，不能被继承
  5.  StringBuffer字符内容是存在char [] value ，所在变化，所以不用每次都更换地址，也就是创建对象，所以效率高于String

- StringBuffer类的构造器

  ```java
  //1.创建一个大小为16的char[]，用于存放字符内容
  StringBuffer stringbuffer = new StringBuffer();
  //直接创建了一个大小为16的数组
  
  //2.通过构造器指定char[]大小
  StringBuffer stringbuffer = new StringBuffer(100);
  //指定这个构造器的大小为100
  
  //3.通过给一个String	创建StringBuffer,char[] 大小就是str.leng() + 16
  StringBuffer hello = new StringBuffer("hello"); 
  ```

- String转换为StringBuffer

  ```java
  //1.使用构造器
  String str = "hi";
  StringBuffer stringBuffer = new StringBuffer(str);
  //返回的strinbuffer才是StringBuffer类，对于str没有影响
  
  //2.使用append方法
  StringBuffer stringBuffer1 = new StringBuffer();
  stringBuffer1 = stringBuffer1.append(str);
  
  //StringBuffer->String
  StringBuffer stringBuffer3 = new StringBuffer("asd");
  //1.使用StringBuffer 提供的toString方法
  String s = stringBuffer3.toString();
  //2.使用构造器
  String s1 = new String(stringBuffer3); 
  ```

- StringBuffer的方法

  ```java
  //增
  String s = "hello";
  s.append(",")//hello,
  s.append("das")//hello,das
  s.append(100).append(true).append(123);
  //hello,das100true123
  
  //删除
  //删除11~14的字符，不包括14
  s.delete(11,14);
  System.out.println(s);
  
  //改
  s.replace(9,11,"dsa");
  //索引9~11的字符替换为dsa
  
  //查找
  int indeOf = s.indexOf("dsa");
  //查找指定的字符串第一次出现的索引，找不到返回-1
  
  //插入
  s.insert(9,"dsa");
  //在索引为9的位置插入dsa，原来索引为9的内容自动后移
  
  //长度
  System.out.println(s.length());  
  ```

  ```java
  //例题
  String str = null;
  StringBuffer sb = new StringBuffer();
  sb.append(str);//AbstractStringBuilder的appendNull
  System.out.println(sb.length());//4
  
  //appendNull源码
  private AbstractStringBuilder appendNull() {
    int c = count;
    ensureCapacityInternal(c + 4);
    final char[] value = this.value;
    value[c++] = 'n';
    value[c++] = 'u';
    value[c++] = 'l';
    value[c++] = 'l';
    count = c;
    return this;
  }
  
  System.out.println(sb)//null
    StringBuffer sb1 = new StringBuffer(str);
  
  //底层源码
  public StringBuffer(String str) {
    super(str.length() + 16);
    //这里传入的是null 所以直接报错
    append(str);
  }
  
  System.out.println(sb1);
  ```

  

### 11.4.StringBuilder类

- 介绍

  StringBuilder和StringBuffer类都是有着相同方法的，但是**StringBuilder类更适合用于单线程，而StringBuffer类用于多线程，**

  StringBuilder上主要是append 和insert方法

  StringBuilder**继承AbstractStringBuilder类**

  也实现了Serializbale，说明可以**串行化**（进行网络传输，可以保存到文件）

  StringBuilder**是final类，不能被继承**

  StringBuilder的对象字符序列是仍然存放在其父类AbstrcatStringBuilder 的char[] value; 因此是存放在**堆中的**

  StringBuilder的方法没有做互斥的处理，即使没有synchronized关键字，因此在**单线程下使用StringBuilder**

  

- StringBuilder和StringBuffer类的比较

  1. 方法类似，均代表可变的字符序列，而且方法也一样
  2. String 不能改变字符序列，效率低但复用率高
  3. StringBuffer 可变字符序列，效率较高，线程安全
  4. StringBuilder可变字符序列，效率高，线程不安全
  5. String使用细节：
     1. String s = “a”;
     2. s += “b”;//实际上原来的字符串对象已经被丢弃了，现在又产生了一个字符串，如果多次执行这些改变串内容的操作，会导致大量副本字符串对象存留在内存中，从而降低效率，如果放在循环中，会极大降低性能
     3. 如果我们对String做大量修改，不要使用String

- String,StringBuffer,StringBuilder类

  使用原则：

  1. 如果字符串存在大量的修改操作，一般使用StringBuffer或者StringBuilder
  2. 如果字符串存在大量修改操作，而且存在单线程情况，使用StringBuilder
  3. 如果字符串存在大量修改操作，而且存在多线程情况，使用StringBuffer
  4. 我们字符串很少修改，被多个对象引用时，使用String





### 11.5.Math类

```java
//Math的常用方法
//1.abs绝对值
int abs = Math.abs(-9);//9

//2.pow求幂
double pow = Math.pow(2,4);//2的4次方 =16

//3.ceil向上取整，返回>=该参数的最小整数（转换为doubl）
double ceil =  Math.ceil(3.9)//4.0
  
//4.向下取整 返回<=该参数的最大整数(转换为double)
double floor = Math.floor(-4.999);//-5.0

//5.round四舍五入
long round = Math.round(5.51);//6
System.out.println(round);

//6.sqrt开方
double sqrt = Math.sqrt(9.0)//3.0
double sqrt = Math.sqrt(-9.0)//NaN
  
//7.random随机数 0—1之间
double d = Math.random();

//8.min max 最大最小值
int min = Math.min(1,9);//1
int max = Math.max(45,90);//90

```





### 11.6.Arrays类

```java
//1.Arrays.toString方法 显示数组
Integer[] integers = {1,2,3};
System.out.println(Arrays.toString(integers));//[1, 2, 3]

//源代码
public static String toString(Object[] a) {
  if (a == null)
    return "null";

  int iMax = a.length - 1;
  if (iMax == -1)
    return "[]";

  StringBuilder b = new StringBuilder();
  b.append('[');
  for (int i = 0; ; i++) {
    b.append(String.valueOf(a[i]));//遍历数组，然后拼接起来
    if (i == iMax)
      return b.append(']').toString();
    b.append(", ");
  }
}

//2.sort排序
//数组是引用类型，通过sort排序后，直接影响实参arr
//sort重载的，也可以通过传入一个接口Comparator实现定制排序
//Arrays.sort(arr)默认排序方法
Integer[] integers = {1,7,45,123,654,82,3};
Arrays.sort(integers,0,4);	//从下标为0的开始到下标为4的进行排序
Arrays.sort(integers);//全部自动排序时
System.out.println(Arrays.toString(integers));//输出数组


//定制排序 从大到小
Integer[] arr ={1,3,76,2,32,654,21,432,7,8};
Arrays.sort(arr,new Comparator(){
  @Override
  public int compare(Object o1, Object o2) {
    Integer i1 =(Integer) o1;
    Integer i2 =(Integer) o2;
    return i2-i1;//改变为i1-i2则为正序
  }
});
System.out.println(Arrays.toString(arr));//遍历数组输出

//冒泡排序
int temp = 0;
public static void bubble(int[] arr){
  for(int i = 0; i< arr.length-1;i++){
    for(int j = 0; j<arr.length-1-i;j++){
      if(arr[j] > arr[j+1]){
        temp = arr[j];
        arr[j]= arr[j+1];
        arr[j+1] =temp;
      }
    }
  }
}

//冒泡+定制
int temp = 0;
public static void bubble2(int[] arr,Comparator c){
  for(int i = 0; i< arr.length-1;i++){
    for(int j = 0; j<arr.length-1-i;j++){
      if(c.compare(arr[j],arr[j+1]) > 0){
        temp = arr[j];
        arr[j]= arr[j+1];
        arr[j+1] =temp;
      }
    }
  }
}


//binarySearch二分搜索查找，要求必须排好序
//源代码
//数组必须是有序，不管从大到小，还是从小到大
//返回的是下标
private static int binarySearch0(Object[] a, int fromIndex, int toIndex,Object key) {
  int low = fromIndex;
  int high = toIndex - 1;

  while (low <= high) {
    int mid = (low + high) >>> 1;
    @SuppressWarnings("rawtypes")
    Comparable midVal = (Comparable)a[mid];
    @SuppressWarnings("unchecked")
    int cmp = midVal.compareTo(key);

    if (cmp < 0)
      low = mid + 1;
    else if (cmp > 0)
      high = mid - 1;
    else
      return mid; // key found
  }
  return -(low + 1);  // key not found.
  //返回的是-（应该所在的下标+1）
}

//copyOf数组元素的复制
//从arr数组中，拷贝arr.length个元素到newArr数组中
//如果拷贝的长度>arr.length就在新数组的后面 增加null
//如果拷贝的长度为负数，则会报错
Integer[] newArr = Arrays.copyOf(arr,arr.length+1);
System.out.println(Arrays.toString(newArr));


//fill数组填充
Integer[] num =new Integer[]{9,3,2};
Arrays.fill(num,2);
//把num数组所用填充为2

//equals比较俩个数组元素内容是否完全一致
Integer[] num2 = new Integer[]{9,3,2};
bollean equals = Arrays.equals(num,num2);
//equals=true;

//asList将一组值，转换为list
//asList会将（2,3，4,5,6）转换为一个List集合
//返回的是asList编译类型List（接口）
List asList = Arrays.asList(2,3,4,5,6);
System.out.println(asList);
System.out.println(asList.getClass());
//[2, 3, 4, 5, 6]
//class java.util.Arrays$ArrayList
```











### 11.7.System类

  ```java
  //exit退出当程序
  System.exit(0);
  //此方法调用 exit 类 Runtime中的方法。此方法从不正常返回。
  //调用 System.exit(n) 实际上等同于调用：
  //进程已结束，退出代码为 (0)
  
  
  //arraycopy(src,1,dest,1,2);
  //   * @param      src      the source array.//源数组
  //   * @param      srcPos   starting position in the source array.// 从源数组的哪个索引位置开始拷贝
  //   * @param      dest     the destination array.//目标数组，既把源数组的数据拷贝到哪个数组
  //   * @param      destPos  starting position in the destination data.//把源数组的数据拷贝到 目标数组的哪个索引
  //   * @param      length   the number of array elements to be copied.//从源数组拷贝多个数据到目标数组
  
  //currentTimeMills 返回当前时间距离1970-1-1的毫秒数
  System.out.println(System.currentTimeMills());
  ```







### 11.8.BigInteger和BigDecimal类

1. BigInteger适合保存比较大的整数

   ```java
   BigInteger bigInteger = new BigInteger("123124353121234132");
   BigInteger bigInteger2 = new BigInteger("1234132");
   System.out.println(bigIngeter);
   //在对Integer进行加减乘除的时候，需要对应的方法，不能直接加减乘除
   //可以再创建一个对象 要操作的BigInteger然后进行相应操作
   BigInteger add = bigInteger.add(bigInteger2);
   BigInteger subtract = bigInteger.subtract(bigInteger2);
   BigInteger divide = bigInteger.divide(bigInteger2);
   BigInteger multiply = bigInteger.multiply(bigInteger2);
   System.out.println(add);//123124353122468264
   System.out.println(subtract);//123124353120000000
   System.out.println(divide);//99765951390
   System.out.println(multiply);//151951704166214921793424
   ```

2. BigDecimal适合保存精度更高的浮点型（小数）

   ```java
   BigDecimal bigDecimal = new BigDecimal("1231.32132131");
   BigDecimal bigDecimal1 = new BigDecimal(1.1);
   //1.如果对BigDecimal进行运算，比如加减乘除，然后要使用对应的方法
   //2.创建一个BigDecimal然后调用相应的方法即可
   System.out.println(bigDecimal.add(bigDecimal1));//232.421321310000000088817841970012523233890533447265625
   System.out.println(bigDecimal.subtract(bigDecimal1));//1230.221321309999999911182158029987476766109466552734375
   System.out.println(bigDecimal.multiply(bigDecimal1));//1354.45345344100010936330253041859350560116581618785858154296875
   //   System.out.println(bigDecimal.divide(bigDecimal1));//Non-terminating decimal expansion; no exact representable decimal result.
   System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));//1119.38301938
   //保留的小数跟bigDecimal的小数保持一致
   ```

   





### 11.9.日期类

- 第一代日期类

1. Date:精确到毫秒，代表特定的瞬间

2. SimpleDateFormat：格式和解析日期的类

   ```java
   Date d1 = new Date();//获取当前时间
   System.out.println("当前时间="+d1);//当前时间=Tue Jan 02 16:49:51 CST 2024
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");//2024-01-02 04:49:51 星期二
   String format = sdf.format(d1);
   System.out.println(format);
   
   //通过毫秒数来得到时间 ，也就是从1970-1-1-开始加
   Date d2 = new Date(1322113214);
   System.out.println(d2);
   
   //把字符串转变为对应的data日期
   //Date再输出时，仍然是国外形式，需要进行格式转换
   //String ->Date 使用的sdf格式需要和给你的String格式一致，不然会抛出转换异常
   String s = "1999-3-21 12:23:32 星期日";
   Date parse = sdf.parse(s );
   System.out.println(sdf.format(parse));//1999-03-21 12:23:32 星期日
   ```

- 第二类日期类

  1. Calender是一个抽象类，并且构造器是private

  2. 可以通过getInstance()来获取实例

  3. 提供大量的方法和字段提供给程序员

     ```java
     Calendar c = Calendar.getInstance();//创建对象实例
     System.out.println("c="+c);
     
     System.out.println(c.get(Calendar.YEAR));//年
     System.out.println(c.get(Calendar.HOUR_OF_DAY));//时间
     System.out.println(c.get(Calendar.DAY_OF_WEEK));//这周的第几天（国外是星期日为周一的第一天）
     //后面方法以此类推
     ```

- 第三类日期类

  ```java
  //使用now()返回表示当前日期时间的对象
  LocalDateTime localDateTime = LocalDateTime.now();//年月日时分秒
  System.out.println(localDateTime);
  System.out.println(localDateTime.getDayOfMonth());//这个月的第几天
  System.out.println(localDateTime.getHour());//小时
  System.out.println(localDateTime.getDayOfYear());//这个年的第几天
  System.out.println(localDateTime.getMinute());//分钟
  System.out.println(localDateTime.getDayOfWeek());//这周的第几天
  
  LocalDate now1 = LocalDate.now();
  LocalTime now2 = LocalTime.now();																																																																																															
  
  System.out.println(now1);//年月日
  System.out.println(now2);//时分秒
  ```

- DateTimeFormatter格式日期类

  ```java
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern(格式);
  String str = dtf.format(日期对象);
  
  //案例
  LocalDateTime ldt = LocalDateTime.now();
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
  String strDate = dtf.formate(ldt);
  ```
  
- 时间戳

  ```java
  Instant now = Instant.now();
  System.out.println(now);
  
  Date date = Date.from(now);
  Instant instant = date.toInstant();
  System.out.println(date);
  System.out.println(instant);
  ```

- plus和minus方法

  ```java
  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
  LocalDateTime ldt = LocalDateTime.now();
  LocalDateTime localDateTime = ldt.plusDays(234);//加上天数
  System.out.println(localDateTime);
  LocalDateTime localDateTime1 = ldt.minusMinutes(1214);//多少分钟前
  System.out.println(dateTimeFormatter.format(localDateTime1));
  ```

  

[^1-3-2024]:ending this chapter





## 12.集合

1. 可以动态保存多个对象
2. 提供了一系列方便的操作对象
3. 使用集合添加，删除新元素的代码更加简洁

<a href="https://smms.app/image/y4zo5VrcWhI9SjH" target="_blank"><img src="https://s2.loli.net/2024/01/03/y4zo5VrcWhI9SjH.png" ></a>

### 12.1.Collection

`public interface Collection <E> extends lterable <E>`

1. collection实现子类可以存放多个元素，每个元素可以是object
2. 有些Collection的实现类，可以存放重复的元素，有些不可以
3. 有些Collection的实现类，有些是有序的（List）,有些不是有序的（Set)
4. Collection接口没有直接的实现子类， 是通过它的字接口Set和List来实现的
5. List不能直接实例化，他是一个接口，可以用子类ArrayList来实现实例化

- Collection的子类的常用方法

  ```java
  List list = new ArrayList();
  //add添加单个元素
  list.add("jack");
  list.add(10);//实际上为list.add(new Integer(10))
  list.add(true);
  
  //remove删除元素
  list.remove(0);//删除第一个元素
  list.remove("jack");//指定删除某个元素
  list.remove(true);
  
  //contains查找元素是否存在
  System.out.println(list.contains("jack"));//false
  
  //size获取元素个数
  System.out.println(list.size());//1
  
  //isEmpty判断是否为空
  System.out.println(list.isEmpty());//false
  
  //clear清空
  list.clear();
  System.out.println(list);//[]
  //addAll添加多个元素
  ArrayList list1 = new ArrayList();
  
  list1.add("123");
  list1.add("345");
  list1.add("234");
  list.addAll(list1);
  System.out.println(list);//[123, 345, 234]
  
  //containsAll判断多个元素 是否都存在
  System.out.println(list.containsAll(list1));//true
  
  //removeAll 删除多个元素
  list.add("111");
  list.removeAll(list1);//删除的是list中list1的元素
  
  System.out.println(list);//[111]
  ```

- 使用Iterator（迭代器）

  1. lterator对象称为迭代器，主要用于遍历Collection集合中的元素

  2. 所以实现了Collection接口的集合类都有一个iterator（）方法，用以返回一个实现了 Iterator接口的对象，既可以返回一个迭代器

  3. Iterator仅用于遍历数组，Iterator本身并不存放对象

  4. `Iterator iterator = coll.iterator();//得到一个集合的迭代器`

  5. `hasNext();//判断是否还有下一个元素`

     `while(iterator.hasNext()){}`

     `next()//1.下移//2.将下移以后集合位置上的元素返回`

     ```java
     Collection collection = new ArrayList();
     collection.add(new Book("asd", "1"));
     collection.add(new Book("sdf", "2"));
     collection.add(new Book("dfg", "3"));
     
     Iterator iterator = collection.iterator();
     //快捷键itit  ， ctrl + j;
     while (iterator.hasNext()) {
       Object next =  iterator.next();
       System.out.println(next);
     }
     //当退出while的时候，collection.iterator迭代器
     //是指向最后一个元素
     //如果想要再次遍历，需要我们重置我们的迭代器
     iterator = collection.iterator();//重置迭代器
     System.out.println("-------------");
     while (iterator.hasNext()) {
       Object next =  iterator.next();
       System.out.println(next);
     }
     System.out.println();
     for (Object book:collection
         ) {
       System.out.println(book);
     
     }
     //增强for底层还是迭代器
     //简化版的迭代器
     //快捷键 大写I 
     ```

- for循环增强

  ```java
  List list = new ArrayList();
  int[] arr = {1,2,3,4,5};
  for (int num:arr//增强for循环
      ) {
    System.out.println(num);
  }
  
  List list = new ArrayList();
  list.add(new Dog("123", 12));
  list.add(new Dog("234", 13));
  list.add(new Dog("345", 11));
  list.add(new Dog("456", 5));
  
  for (Object dog:list  ) {
    System.out.println(dog);
  } 
  ```





### 12.2.List

- List接口基本介绍
  1. List是Collection接口的子接口
  2. List集合类中元素**有序（既添加顺序和取出顺序一致，且可以重复）**
  3. List集合类中的每个元素都有其对应的顺序索引，**既支持索引**
  4. List容器中的元素都**对应一个整数的序号记载其在容器中的位置，可以根据序号存取容器中的元素**

```java
List list = new ArrayList();
list.add("jack");
list.add("tom");
list.add("dick");
list.add("tom");//可以重复
list.add("jack");

System.out.println(list);//[jack, tom, dick, tom, jack]
//索引是从0开始的
System.out.println(list.get(3));//tom

//list实现的子类有很多
//常用的有Vector,ArrayList,LinkedList


//list接口方法(接口不能实例化）
//void add(int index ,Object ele) 在index位置插入ele元素
//在index = 1的位置插入一个对象
list.add(1, "dicker");
System.out.println(list);//[jack, dicker, tom, dick, tom, jack]

//boolean addAll(int index, Collection eles)
// 从index的位置开始将eles的所有元素添加进来

List list2 = new ArrayList();
list2.add("tom");
list2.add("john");

list.addAll(2,list2);
System.out.println(list);
//[jack, dicker, tom, john, tom, dick, tom, jack]


//Object get(int index)获取指定index位置的元素

//int indexOf(Object obj)返回obj在集合中首次出现的位置
//类似查找
System.out.println(list.indexOf("tom"));//2

//int lastIndexOf(Object obj)
//返回obj在当前集合中末次出现的位置
System.out.println(list.lastIndexOf("tom"));//6

//Object remove(int index)移除指定index位置的元素，并返回此元素
list.remove(0);
System.out.println(list);//[dicker, tom, john, tom, dick, tom, jack]

//Object set(int index,Object ele)设置指定的index位置的元素为ele，相当于替换
list2.set(1, "simth");
System.out.println(list2);//[tom, simth]
//如果下标越界,则报错

//List subList(int fromIndex, int toIndex)返回从fromIndex到toIndex位置的子集合
//fromIndex<= subList<toIndex
List returnlist = list.subList(0, 2);//区间是前闭后开
System.out.println(returnlist);//[dicker, tom]

```

- List的三种遍历方式

  1. 使用iterator

     ```java
     Iterator iter = col.iterator();
     while(iter.hasNext()){
     	Object o = iter.next();
     }
     ```

  2. 增强for循环

     ```java
     for(Object o : col){
       
     }
     ```

  3. 使用普通for

     ```java
     for(int i = 0;i < list.size(); i ++){
       Object object = list.get(i);
       System.out.println(object);
     }
     ```

- List的冒泡排序

  ```java
  List list = new ArrayList();
  list.add(new Book("西游记", 70,"吴承恩"));
  list.add(new Book("红楼梦", 90,"曹雪芹"));
  list.add(new Book("水浒传", 80,"施耐庵"));
  Iterator iterator = list.iterator();
  while (iterator.hasNext()) {
    Object next =  iterator.next();
    System.out.println(next);
  }
  
  System.out.println("-------------------------------------");
  //List的冒泡排序
  for (int i = 0; i < list.size()-1;i++){
    for (int j = 0; j < list.size()-i-1;j++){
      Book book1 = (Book)list.get(j);
      Book book2 = (Book)list.get(j+1);
      if(book1.getPrice()> book2.getPrice()){
        list.set(j, book2);
        list.set(j+1, book1);
      }
    }
  }
  ```





### 12.3.ArrayList

```java
//ArrayList可以赋值null
ArrayList objects = new ArrayList();
objects.add(null);
objects.add(1);
System.out.println(objects);//[null, 1]
//可以加入多个空值
//ArrayList是由数组来实现数据存储的
//ArrayList线程不安全，执行效率高
//在多线程情况下，不建议使用ArrayList

```

- 源码分析

  1. ArrayList中维护了一个Object类型的数组elementData.transient Object[] elementData;

  2. 当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，第一次添加时，则扩容elementData为10，如需要再次扩容，则扩容elementData为1.5倍

  3. 如果使用的是指定大小的构造器，则初始elementData容量为指定大小，如果需要扩容，则直接扩容elementData为1.5倍

     ```java
     //创建了一个elementData数组={}
     public ArrayList() {
       this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
     }
     //list.add
     public boolean add(E e) {
       ensureCapacityInternal(size + 1);//确认大小是否够添加
       elementData[size++] = e;//然后再赋值
       return true;
     }
     //
     private void ensureCapacityInternal(int minCapacity) {
       if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
         minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
         //                        10               1 
         //求哪个最大 10最大 最大容量为10
       }
       //明确是否要扩容
       ensureExplicitCapacity(minCapacity);
     }
     //
     private void ensureExplicitCapacity(int minCapacity) {//minCapacity =10
       modCount++;//防止有多个线程
       //记录当前集合被修改的次数
     
       // overflow-conscious code
       if (minCapacity - elementData.length > 0)
         //最小容量减去实际容量大于0，说明不够了
         //满足这个条件，才会去调用grow方法来扩容 
         grow(minCapacity);
     }
     
     private void grow(int minCapacity) {
       // overflow-conscious code  
       int oldCapacity = elementData.length;
       int newCapacity = oldCapacity + (oldCapacity >> 1);//右位移一位 相当于除二
       if (newCapacity - minCapacity < 0)
         newCapacity = minCapacity;
       if (newCapacity - MAX_ARRAY_SIZE > 0)
         newCapacity = hugeCapacity(minCapacity);
       // minCapacity is usually close to size, so this is a win:
       elementData = Arrays.copyOf(elementData, newCapacity);//数组的赋值
       //可以保留原先的数据,保护原先的数据
     }
     
     ```
     
     ```java
     //
     public int compareTo(String anotherString) {
       int len1 = value.length;
       int len2 = anotherString.value.length;
       int lim = Math.min(len1, len2);
       char v1[] = value;
       char v2[] = anotherString.value;
     
       int k = 0;
       while (k < lim) {
         char c1 = v1[k];
         char c2 = v2[k];
         if (c1 != c2) {
           return c1 - c2;
         }
         k++;
       }
       return len1 - len2;
     }
     ```
     
     



### 12.4.Vector

1. Vector底层是一个对象数组，`protected Object[] elementData;`
2. Vector是线程同步的，既线程安全
3. 在开发中，需要线程同步安全时，考虑使用Vector

|  Vector   | 可变数组 | 安全，但效率不高 | 如果是无参，默认为10，然后按2倍开始扩容，指定大小的话，每次按2倍扩 |
| :-------: | :------: | :--------------: | :----------------------------------------------------------: |
| ArrayList | 可变数组 |  不安全，效率高  |  如果有参是1.5倍构造，无参是第一次为10，第二次开始1.5倍扩容  |

- 源码解析

  ```java
  public Vector() {
    this(10);
  }
  //
  public Vector(int initialCapacity) {
    this(initialCapacity, 0);
  }
  //
  public Vector(int initialCapacity, int capacityIncrement) {
    //initiaCapacity = 10; capacityIncrement = 0;
    super();
    if (initialCapacity < 0)
      throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
    //如果传入的容量是负数，则报错为非法容量
    this.elementData = new Object[initialCapacity];//创建数组
    this.capacityIncrement = capacityIncrement;
  }
  //
  public synchronized boolean add(E e) {
    modCount++;
    ensureCapacityHelper(elementCount + 1);
    elementData[elementCount++] = e;
    return true;
  }
  //详情看源代码
  ```



### 12.5.LinkList

```java
void linkLast(E e) {
  final Node<E> l = last;
  final Node<E> newNode = new Node<>(l, e, null);
  last = newNode;
  if (l == null)
    first = newNode;
  else
    l.next = newNode;
  size++;
  modCount++;
}
```



- ArrayList和LinkedList区别

  |            | 底层结构 | 增删效率低         | 改查的效率 |
  | ---------- | -------- | ------------------ | ---------- |
  | ArrayList  | 可变数组 | 效率低，数组扩容   | 较高       |
  | LinkedList | 双向链表 | 较高，通过链表追加 | 较低       |

- 如果选择LinkedList和ArrayList

  1. 如果我们改查的操作多，选择ArrayList
  2. 如果我们增删的操作多，选择LinkedList
  3. 一般来说，大部分情况使用的都是查询，所以选择ArrayList
  4. 在一个项目中，可以根据项目的灵活性来选择LinkedList和ArrayList



### 12.6.Set

- set接口的介绍

  1. **无序性（添加和取出的顺序不一样），没有索引**
  2. **不允许添加重复元素，最多一个null**

- set接口常用的方法

  set接口和List接口一样都是Collection的子接口，因此，常用方法和Collection接口一样

- set接口的遍历方法

  1. 增强for循环
  2. 迭代器
  3. 不能使用索引的方法来遍历

  ```java
  //set接口的实现类的对象（set接口对象），不能存放重复的元素，可以添加一个null
  //set接口的对象存放数据是无序（既添加的顺序和取出的顺序不一致）
  //但是这个无序就是这一种无序，不会因为一直输出，每次输出的顺序都不一样
  Set set = new HashSet();
  set.add("1");
  set.add("2");
  set.add("3");
  set.add("4");
  set.add(null);
  set.add(12);
  set.add(123);
  set.add(13);
  set.add(134);
  System.out.println(set);
  System.out.println("============迭代器===========");
  //[null, 1, 2, 3, 4, 134, 123, 12, 13]
  Iterator iterator = set.iterator();
  //iterator
  while (iterator.hasNext()) {
    Object next =  iterator.next();
    System.out.print(" "+next);
  }
  System.out.println();
  //增强for循环
  System.out.println("==============for===========");
  for (Object obj:set
      ) {
    System.out.print(" " +obj);
  }
  
  //[null, 1, 2, 3, 4, 134, 123, 12, 13]
  //============迭代器===========
  // null 1 2 3 4 134 123 12 13
  //==============for===========
  // null 1 2 3 4 134 123 12 13
  ```

  ```java
  Set set = new HashSet();
  
  //是否添加成功会返回一个boolea值
  System.out.println(set.add("1"));//TRUE
  System.out.println(set.add("1"));//TRUE
  
  set.add(new Dog("tom"));
  set.add(new Dog("tom"));
  //这俩个tom都可以添加进去
  //这俩个tom属于不同的对象
  //所以可以添加进去
  //俩条狗都叫tom，但不是同一狗
  class  Dog{
    private String name;
    public Dog(String name) {
      this.name = name;
    }
  }
  ```

  

  

### 12.7.HashSet

  HashSet底层是HashMap,HashMap底层是（数组+链表+红黑树）

  ```java
  
  public class HashSet_ {
    public static void main(String[] args) {
  
      Node[] table = new Node[15];
      Node node = new Node("123", null);
      table[4] = node;
      Node node1 = new Node("234", null);
      node.next = node1;
      Node node2 = new Node("234", null);
      node1.next = node2;
      Node node3 = new Node("345", null);
      node2.next = node3;
      System.out.println(table);
      Node node4 = new Node("123", null);
      table[8] = node4;
    }
  }
  class Node{
    Object item;//存放数据
    Node next;//指向下一个节点
  
    public Node(Object item, Node next) {
      this.item = item;
      this.next = next;
    }
  }
  ```

- HashSet底层实现机制

  1. HashSet底层是HashMap
  2. 添加一个元素时，先得到hash值，会转成索引值
  3. 找到存储数据表table，看这个索引的位置是否已经存放的有元素
  4. 如果没有，直接添加这个元素
  5. 如果有，调用equals比较，如果相同，就放弃添加，如果不同，则添加到最后
  6. 在JDK8中，如果一条链表的元素超过TREEIFY_THRESHOLD(默认是8)，并且table的大小>=MIN_TREEIFY_CAPACITY(默认为64)，就会进行树化（红黑树）

- HashSet底层扩容机制

  1. HashSet底层是HashMap,第一次添加时，table数组扩容到16，临界值（threshold）是16*加载因子（loadFactor）是0.75 = 12
  2. 如果table数组使用到了临界值12，就会扩容到16\*2=32，新的临界值就是32\*0.75=24,以此类推
  3. 在JDK8中，如果一个链表的元素个数到TREEIFY_THRESHOLD(默认是8)，并且table的大小>=MIN_TREEIFY_CAPACITY(默认64)，就会进行树化（红黑树），否则仍然采用数组扩容机制

  ```java
  //更改hashCode 把值挂载上同一个链上
  HashSet hashSet = new HashSet();
  
  for (int i = 0; i < 100; i++) {
    hashSet.add(new A(i+1));
  }
  //由于这个table初始化为16
  //当同一个链上的数超过8时，并不会直接生成红黑树
  //而是直接再对table进行2倍扩容
  //然后再添加链上的数时
  //继续扩容，直到table到达64时
  //这时链上再进行添加数据时，这是才会生成红黑树
  //这里i=11时生成了一个红黑树
  class A{
    private int n ;
    public A(int n ){
      this.n = n;
  
    }
    //重写hashCode
    //让他们的索引值相同
    //这样一直加的数就为同一个链上了
    @Override
    public int hashCode() {
      return 200;
    }
  }
  ```

  **不管是加在数组上的一个节点，还是加在链上的一个节点，都算在这个hashSet的长度上，只要是增加一个元素，就是添加上了这个hashSet长度**

  ```java
  ++modCount;
  if (++size > threshold)
    resize();
  //源码最后这里++size就是说明 加上了
  ```

  **并不是数组占了12个才会扩容，而是这个hashSet的size到达12个就会扩容**





### 12.8.LinkedHashSet

1. LinkedHashSet是HashSet的子类

2. LinkedHashSet底层是一个LinkedHashMap,底层维护了一个数组+双向链表

3. LinkedHashSet根据元素的hashCode值来决定元素的储存位置，同时使用链表维护元素的次序，这使得元素看起来是以插入顺序保存的

4. LinkedHashSet不允许添加重复的元素

5. LinkedHashSet输入顺序和取出顺序是一致的





### 12.9.Map

- Map接口实现类的特点

  1. Map和Collection并列存在，用于保存具有映射关系的数据：key-Value

  2. Map中的key和value可以是任何引用类型的数据，会封装到HashMao$Node对象中

  3. Map中的key不允许重复

  4. Map中的value可以重复

  5. Map的key可以为null，value也可以为null，key为null，只能为1个，value为null可以有多个

  6. 常用String类作为Map的key

  7. key和value之间存在一对一的关系，通过指定的key总能找到对应的value

  8. HashMap没有实现同步，因此是线程不安全的

     ```java
     HashMap hashMap = new HashMap();
     hashMap.put("1", "123");
     hashMap.put("2", "234");
     hashMap.put("1", "245");
     //当key相等时，是直接把这个value替换了
     hashMap.put("3", "234");
     //key不能重复，而value可以重复
     
     System.out.println(hashMap);
     hashMap.get("1");
     System.out.println(hashMap.get("1"));
     hashMap.put(null, "null!!");
     hashMap.put(4, null);	
     hashMap.put(5, null);
     hashMap.put(new String("123"),"123");
     System.out.println(hashMap);
     ```
  
- 常用方法

  ```java
  HashMap hashMap = new HashMap();
  hashMap.put("1", 1);
  hashMap.put("1", 2);
  hashMap.put("2", 3);
  hashMap.put("3", 3);
  hashMap.put("4", null);
  hashMap.put(null, 5);
  hashMap.put("6", 6);
  System.out.println(hashMap);
  
  //remove根据key删除映射关系
  hashMap.remove(null);
  System.out.println(hashMap);
  
  //get根据key得到value
  System.out.println(hashMap.get("3"));//3
  
  //size获取这个map有多少对 key-value
  System.out.println(hashMap.size());//5
  
  //isEmpty判断是否为空
  System.out.println(hashMap.isEmpty());//false
  
  //clear清空map
  hashMap.clear();
  System.out.println(hashMap);//{}
  
  //containsKey查找键是否存在
  hashMap.put("3", 3);
  System.out.println(hashMap.containsKey("3"));//true
  ```

  

- Map接口的遍历方法

  1. contains:查找key是否存在
  2. keySet:获取所有的key
  3. entrySet:获取所有的k-v
  4. values:获取value

  ```java
  hashMap.put("1", 1);
  hashMap.put("1", 2);
  hashMap.put("2", 3);
  hashMap.put("3", 3);
  hashMap.put("4", null);
  hashMap.put(null, 5);
  hashMap.put("6", 6);
  System.out.println(hashMap);
  
  System.out.println("------取key和value-----");
  HashMap hashMap = new HashMap();
  //1.取出所有的key，通过key取出对应的value
  //keySet是取出所有的key
  Set keyset = hashMap.keySet();
  System.out.println("---------------------");
  System.out.println(keyset);
  System.out.println("---------------------");
  
  //1.1增强for循环
  for (Object key:keyset
      ) {//hashMap.get(key)通过key得到value
    System.out.println(key+ " " +hashMap.get(key));
  }
  System.out.println("---------------------");
  
  
  //1.2迭代器
  Iterator iterator = keyset.iterator();
  while (iterator.hasNext()) {
    Object key =  iterator.next();
    System.out.println(key+" "+ hashMap.get(key));
  }
  
  //2.取出所有的value
  Collection values = hashMap.values();
  System.out.println("---------------------");
  System.out.println(values);
  //[5, 2, 3, 3, null, 6]
  //取出所有的value值
  //使用所用的Collections使用的遍历方法
  System.out.println("---------------------");
  
  //2.1增强for循环
  for (Object value: values
      ) {
    System.out.println(value);
    //通过增强for循环再逐个输出
  }
  System.out.println("---------------------");
  
  //2.2迭代器
  Iterator iterator1 = values.iterator();
  while (iterator1.hasNext()) {
    Object value = iterator1.next();
    System.out.println(value);
  }
  System.out.println("---------------------");
  
  
  //3通过entrySet来获取k-V
  Set set = hashMap.entrySet();
  //先把获得entrySet
  
  //3.1增强for循环
  System.out.println("------------entrySet--------");
  System.out.println(set);
  //取出所有的k-v
  //[null=5, 1=2, 2=3, 3=3, 4=null, 6=6]
  System.out.println("----------------------------");
  for (Object entry: set
      ) {
    //将entry转成hashMap.Entry
    Map.Entry m = (Map.Entry) entry;
    System.out.println(((Map.Entry<?, ?>) entry).getKey());
  
    //((Map.Entry<?, ?>) entry).getKey();也相当于下面的代码，
    //也是强转为Map.Entry去调用这个getKey()方法来获得key
    //value也是相同方法
  
    //转型是要调用这里面的方法去单独获得key和value
    System.out.println(m.getKey()+" "+m.getValue());
  }
  System.out.println("---------------------");
  
  
  
  //3.2迭代器
  Iterator iterator2 = set.iterator();
  while (iterator2.hasNext()) {
    Object next =  iterator2.next();
    //System.out.println(next);
    //System.out.println("-----------------");
    Map.Entry m = (Map.Entry) next;
    //以此类推
    System.out.println(m.getKey()+" "+m.getValue());
  
  }
  System.out.println("---------------------");
  ```



- Map底层结构和源码分析

1. （K,V）是一个Node实现了Map.Entry<K,V>,
2. JDK7的hashmap底层实现了（数组+链表），JDK8底层实现了（数组+链表+红黑树）

- 底层源码介绍
  1. HashMap底层维护了Node类型的数组table，默认为null
  2. 当创建对象时，将加载因子（loadfactor）初始化为0.75
  3. 当添加k-v时，通过key的哈希值得到在table的索引，然后判断该索引处是否有元素，如果没有元素直接添加，如果该处有元素，继续判断该元素的key是否和准备加入的key相同，如果相同，则直接替换value，如果不相同需要判断是树结构还是链表结构，做出相应处理，如果添加时发现容量不够，则需要扩容
  4. 第一次添加时，则需要扩容table为16，临界值为（threshold）为12
  5. 以后再次扩容，则需要扩容table为原来的2倍，临界值为原来的2倍，既24，以此类推
  6. 在JDK8中，如果一个链表的元素超过了8，并且table的大小大于等于64，就会进行树化（红黑树）

```java
final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
               boolean evict) {
  Node<K,V>[] tab; Node<K,V> p; int n, i;//辅助变量
  //第一次传入时，table为null或者leng为0，所以直接执行这个if语句
  if ((tab = table) == null || (n = tab.length) == 0)
    //这个resize()就是给table创建一个16大小的数组
    //这个n就是计算这个table的大小
    n = (tab = resize()).length;
  //在这个table进入resize中,类型就是Node类型
  //Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
  //上面这个代码就是newTab这个数组，类型是Node

  if ((p = tab[i = (n - 1) & hash]) == null)
    //通过hash得到一个位置，如果这个hash指的位置为空
    //那么就直接挂上去了
    //也就是创建了一个Node直接把要放到数据放进这个新创建的Node了

    tab[i] = newNode(hash, key, value, null);
  //table表里面创建了一个元素

  else {//当key重复的时候，这个p不再是null了
    Node<K,V> e; K k;
    if (p.hash == hash &&//如果table的索引位置的key的hash值很新的hash值相同，并equals返回真
        ((k = p.key) == key || (key != null && key.equals(k))))
      //(k =p.key) ==key 说明加进去是同一个对象
      e = p; 
    else if (p instanceof TreeNode)//如果是红黑树，就会走下面的代码
      //按照红黑树的方式来处理
      e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
    else {
      //如果找到的节点，后面是链表，就循环比较
      //走下面代码是怀疑你是链表
      //就会一个一个比较这个链表的值是否相同
      //如果不相同就会在这个链表上最后面挂着
      for (int binCount = 0; ; ++binCount) {//死循环不会出来
        if ((e = p.next) == null) {//如果整个链表没有和他相同的(equals)

          p.next = newNode(hash, key, value, null);
          //加入后，判断当前链表的个数，是否已经到达8个，到达后，就调用treeifyBin进行树化
          if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
            //到8个才树化就退出             7
            treeifyBin(tab, hash);
          //并不会立马树化
          //这个方法里面还会判断table的大小是否到达64,
          //如果没有到达就先对table进行扩容
          //直到table到达64之后，才会树化
          break;//找了一遍，没有找到就加上
        }
        if (e.hash == hash &&
            //如果在循环比较中，发现有相同，就不在添加，就break，替换
            ((k = e.key) == key || (key != null && key.equals(k))))
          break;
        p = e;
      }
    }
    if (e != null) { // existing mapping for key
      //找到一个跟key相同的节点
      V oldValue = e.value;
      if (!onlyIfAbsent || oldValue == null)
        e.value = value;//这里是把原来的值替换成新的值
      afterNodeAccess(e);
      return oldValue;
    }
  }
  //每次增加一个Node就size++
  ++modCount;//修改一次，这个modCount就会记一次
  if (++size > threshold)//++size表示这个table表里面的元素
    //这个threshold就是临界值（12，24,48,96....）
    //大于临界值就会扩容
    //这个++size之后没有到达12就不会扩容
    //如果++size到达12之后就会直接对这个table数组进行扩容
    resize();
  afterNodeInsertion(evict);// 
  return null;
}
```

```java
//重写hash方法
static final int hash(Object key) {
  int h;
  return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
}
//重写hash这个方法可以实现在table上挂载到同一节点上
```







### 12.10.Hashtable

1. 存放元素是K-V
2. hashtable的键和值都不能为null
3. hashTable使用方法基本上和HashMap一样
4. hashTable是线程安全的（synchronized），hashMap是线程不安全的

|           | 版本 | 线程安全 | 效率 | 允许null键和null值 |
| --------- | ---- | -------- | ---- | ------------------ |
| HashMap   | 1.2  | 不安全   | 高   | 运行               |
| Hashtable | 1.0  | 安全     | 低   | 不允许             |

```java
Hashtable hashtable = new Hashtable();
hashtable.put("1", 1);
hashtable.put("2", 2);
hashtable.put("3", 1);
hashtable.put("1", 4);//替换
//  hashtable.put(null, 5);//NullPointerException
//  hashtable.put("6", null);//NullPointerException
System.out.println(hashtable);

//HashTable底层
//1.底层有数组 Hashtable$Entry[].初始化为11
//这个Entry是Hashtable的内部类
//2.临界值threshold = 8 = 11*0.75
//3.扩容机制：初始化为11，超过>=8个元素，开始扩容，依次扩容
//再判断是否大于最大的这个值
//4.执行 方法 addEntry(hash,key,value,index);添加k-v封装到Entry中
//int newCapacity = (oldCapacity << 1) + 1; 11*2+1 = 23
```





### 12.11.Properties

1. Properties类继承自Hashtable类并实现了Map接口，也是一种键值对的形式来保存数据
2. 使用特点和Hashtable类似
3. Properties还可以用于从XXX.properties文件中，加载数据到Properties类对象，并进行读取和修改
4. 说明：XXX.properties文件通常作为配置文件，这个知识点在IO流举例

```java
//1.Properties 继承了Hashtable
//2.可以通过k-v存放数据，key和value不能为null
//增加
Properties properties = new Properties();
//  properties.put(null,"1");//NullPointerException
//  properties.put("2",null);//NullPointerException
properties.put("123", 123);
properties.put("13", 123);
properties.put("12", 1);
properties.put("123", 115);
//key相同直接替换
System.out.println(properties);
//{13=123, 12=1, 123=115}

//通过key获得对应的值
System.out.println(properties.get("12"));//1

//删除
properties.remove("12");
System.out.println(properties);
```







### 12.12.TreeSet

```JAVA
//1.我们使用无参构造器，创建TreeSet,仍然是无序的
//2.使用TreeSet提供的一个构造器，可以传入一个比较强（匿名内部类）

//1.
TreeSet treeSet = new TreeSet();
treeSet.add("6");
treeSet.add("1");
treeSet.add("2");
treeSet.add("4");
treeSet.add("3");
treeSet.add("5");
System.out.println(treeSet);
//[1, 2, 3, 4, 5, 6]

//2.
TreeSet treeSet1 = new TreeSet(new Comparator() {
  @Override
  public int compare(Object o1, Object o2) {
    //调用compareTo去进行字符串大小的比较
    //按照
    return ((String)o2).compareTo((String) o1);
    //return ((String)o2).length()-((String)o2).length();
    //判断长度是否相等
    //如果长度相等，就无法添加进去
    //只能替换value 
  }
});
treeSet1.add("6");
treeSet1.add("3");
treeSet1.add("5");
treeSet1.add("2");
treeSet1.add("1");
treeSet1.add("4");
treeSet1.add("4");
System.out.println(treeSet1);
//[6, 5, 4, 3, 2, 1]
//添加的是重复的，并不会进去

//源码解析
public V put(K key, V value) {
  Entry<K,V> t = root;
  if (t == null) {
    compare(key, key);
    //第一次添加 这俩个key都是第一次传进来的key
    //所以比较的是相等，也没有用任何变量来接受
    //只是防止传进的是null
    //如果为null，compare会抛出异常
    
    // type (and possibly null) check
    root = new Entry<>(key, value, null);
    size = 1;
    modCount++;
    return null;
  }
  int cmp;
  Entry<K,V> parent;
  // split comparator and comparable paths
  Comparator<? super K> cpr = comparator;
  if (cpr != null) {
    do {
      //遍历所有的key
      //给当前这个key找适当的位置
      parent = t;
      cmp = cpr.compare(key, t.key);
      //这里的compar是比较传入的这个俩个数据的比较
      //比较的是字符串的大小来比较
      //按照abcdefg来排序
      if (cmp < 0)
        t = t.left;
      else if (cmp > 0)
        t = t.right;	
      else
        //如果等于的话就 不会再传入这个数据
        //但这个value会被替换到当前的这个value
        //不再是原来的value
        return t.setValue(value);
    } while (t != null);
  }
  else {
    if (key == null)
      throw new NullPointerException();
    @SuppressWarnings("unchecked")
    Comparable<? super K> k = (Comparable<? super K>) key;
    do {
      parent = t;
      cmp = k.compareTo(t.key);
      if (cmp < 0)
        t = t.left;
      else if (cmp > 0)
        t = t.right;
      else
        return t.setValue(value);
    } while (t != null);
  }
  Entry<K,V> e = new Entry<>(key, value, parent);
  if (cmp < 0)
    parent.left = e;
  else
    parent.right = e;
  fixAfterInsertion(e);
  size++;
  modCount++;
  return null;
}
```



### 12.13.Collections

1. Collections是一个Set，List和Map等集合的工具类
2. Collections中提供了一系列静态的方法对集合元素进行排序，查询和修改等操作

 ```java
 List list = new ArrayList();
 list.add("100");
 list.add("999");
 list.add("888");
 list.add("777");
 list.add("66");
 list.add("5");
 list.add("4");
 System.out.println(list);
 System.out.println();
 //[0, 9, 8, 7, 6, 5, 4]
 
 //reverse倒置输入的顺序
 //输入顺序与输出顺序相反
 Collections.reverse(list);
 System.out.println(list);
 System.out.println();
 //[4, 5, 6, 7, 8, 9, 0]
 
 //shuffle打乱排序
 //每次输出的顺序都不一样
 Collections.shuffle(list);
 System.out.println(list);
 System.out.println();
 
 //sort按照元素的顺序自然排序
 //按照字符串大小来排序
 //这个sort底层还是调用了compareTo来进行排序
 Collections.sort(list);
 System.out.println(list);
 System.out.println();
 
 Collections.sort(list, new Comparator() {
   @Override
   public int compare(Object o1, Object o2) {
     //重写compare方法 按照字符串长度来排序
     return ((String)o1).length()-((String)o2).length();
   }
 });
 System.out.println(list);
 System.out.println();
 //[4, 5, 66, 100, 777, 888, 999]
 
 //swap交换
 //swap(list,int i,int j)
 //指定i和j处的元素进行交换
 //越界会显示索引越界
 Collections.swap(list, 4, 2);
 System.out.println(list);
 System.out.println();
 //[4, 5, 777, 100, 66, 888, 999]
 
 //max按照自然排序，给出排序的最大值
 System.out.println(Collections.max(list));
 System.out.println();
 //999
 
 //max(Collection,Comparator)
 //根据Comparator指定的顺序,返回给定集合中的最大的元素
 Object max = Collections.max(list, new Comparator() {
   @Override
   public int compare(Object o1, Object o2) {
     return ((String) o1).length() - ((String) o2).length();
   }
 });
 System.out.println(max);
 System.out.println();
 //777 返回的是长度最大的
 
 //min和max使用方法相同
 
 //frequency(Collection,Object)
 System.out.println(Collections.frequency(list, "888"));
 System.out.println();
 //3 “888出现3次”
 
 //copy拷贝
 ArrayList dest = new ArrayList();
 //把list的数据拷贝到dest中
 //但是我们直接拷贝的话，会出现索引异常的情况
 //因为我们的这个dest默认的大小是没有list的大
 //所以我们需要对dest进行扩容，要大于等于这个list的大小
 for (int i = 0; i < list.size(); i++) {
   dest.add("");
 }
 Collections.copy(dest, list);
 System.out.println(dest);
 System.out.println();
 //[4, 5, 777, 100, 66, 888, 888, 888, 999]
 //拷贝成功
 
 //replace替换
 Collections.replaceAll(list, "888", "333");
 //把所有的888替换成333
 System.out.println(list);
 System.out.println();
 //[4, 5, 777, 100, 66, 333, 333, 333, 999]
 ```

```java
public class HomeWork4 {

  public static void main(String[] args) {

    HashSet set = new HashSet();
    Person p1 = new Person(1001,"AA");
    Person p2 = new Person(1002,"BB");
    set.add(p1);
    set.add(p2);
    p1.setName("CC");
    set.remove(p1);
    System.out.println(set);
    //这里因为修改的了p1的name
    //所以这个hash发生改变 hash：2080->2144
    //当我们去删除这个p1的时候就找到的不是这个p1
    //我们删除的找是找原来AA的那个p1
    //所以删除不到
		//输出为id=1002, name='BB
    //     id=1001, name='CC
    set.add(new Person(1001, "CC"));
    System.out.println(set);
    //当我们再去添加这个新的1001,CC时
    //这个hash与原来那个修改过变成的1001,CC的hash不一样
    //但是存储的table一样，所以就挂载在一起了
    //这几个1001都是挂载在一个table上
    //所以我们可以再创建一个相同的1001，CC
 		// id=1002, name='BB
		// id=1001, name='CC
		// id=1001, name='CC
    set.add(new Person(1001,"AA"));
    System.out.println(set);
  }
}
class Person{
  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return
      "id=" + id +
      ", name='" + name + '\n'
      ;
  }
  public void setName(String name) {
    this.name = name;
  }
  private int id;
  private String name;
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return Objects.equals(name, person.name) && Objects.equals(id, person.id);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }
}

```



[^1-5-2024]:ending….



## 13.泛型

### 13.1.泛型的介绍

1. 泛型又称参数化类型，是JDK5出现的一个新的特性，解决了数据类型的安全性问题
2. 在类声明或实例化时只要指定好需要的具体的类型即可吗

### 13.2.泛型的好处

1. 编译时，检查添加的元素，提高了安全性

2. 减少了类型转换的次数，提高了效率

3. 不在提升编译警告

   ```java
   ArrayList<Dog> dogs = new ArrayList<Dog>();
   
   dogs.add(new Dog("dick",1));
   dogs.add(new Dog("mary",2));
   dogs.add(new Dog("smith",3));
   //dogs.add(new Cat("tom",11));
   //泛型限制了只能添加Dog类
   //在遍历的时候更加方便，直接取出的就是Dog类
   //不需要再进行强转
   //更加安全了
   for (Dog dog: dogs
       ) {
     System.out.println(dog);
   }
   //如果不使用泛型，在加入这个ArrayList是Object类的
   //如果使用的话就存放也是Dog类，取出也是Dog类
   ```

   ```java
   HashSet<Student> students = new HashSet<Student>();
   //E-是Student类型的
   students.add(new Student("DICK", 12));
   students.add(new Student("COCK", 12));
   students.add(new Student("PENIS", 12));
   
   for (Student s:students
       ) {
     System.out.println(s);
   }
   System.out.println("-------------------------------");
   HashMap<String, Student> stringStudentHashMap = new HashMap<>();
   //定义的时候
   //K-是String类型  V-是Student类型
   //所以下面直接就说 K-是String类型  V-是Student类型
   stringStudentHashMap.put("1", new Student("dick",12));
   stringStudentHashMap.put("2", new Student("cock",12));
   stringStudentHashMap.put("3", new Student("penis",12));
   
   Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
   Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
   /**
   *   public final Iterator<Map.Entry<K,V>> iterator() {
   *             return new EntryIterator();
   *         }
   */
   while (iterator.hasNext()) {
     Map.Entry<String, Student> next =  iterator.next();
     System.out.println(next);
   ```



### 13.3.泛型的语法和使用

- 使用细节

  1. `interface List<T>{}, public class HashSet <E>{}`

     说明：T,E只能是引用类型

     `List<Integer> list = new ArrayList<Integer>();//T`

     `List<int>list2 = new ArrayList<int>();//F`

  2. 在指定泛型具体类型后，可以传入该类型或者其子类类型

     ```java
     Pig<A> aPig = new Pig<A>(new A());
     Pig<A> aPig2 = new Pig<A>(new B());
     
     class A{}
     class B	extends A{}
     class Pig<E>{
       E e;
       public Pig(E e) {
         this.e = e;
       }
     }
     ```

  3. 使用形式

     ```java
     ArrayList<Integer> list1 = new ArrayList<Integer>();
     List<Integer> list2 = new ArrayList<Integer>();
     //在实际开发中，一般简写
     //编译器自己会进行类型判断
     ArrayList<Integer> list3 = new ArrayList<>();
     List<Integer> list4 = new ArrayList<>();
     ArrayList<Pig> pigs = new ArrayList<>();
     
     ArrrayList arratList = new ArrayList();
     //相当于把<Object>省略了
     //相当于ArrayList<Object> arrayList = new ArrayList<Object>();
     ```



### 13.4.自定义泛型

- 自定义泛型

  `class 类名 <T,R...>{}//可以有多个泛型`

- 细节

  1. 普通成语可以使用泛型（属性，方法）

  2. 使用泛型的数组，不能初始化

  3. 静态方法中不能使用类的泛型

  4. 泛型类的类型，是在创建对象时确定的（因为创建对象时，需要指定确定的类型

  5. 如果在创建对象时，没有指定类型，默认为Object

     ```java
     //tiger后面的泛型，所以我们把Tiger称为自定义泛型
     //TRH泛型的标识符，一般是单个大写字母
     //泛型标识可以有多个
     class Tiger<T,R,M>{
       String name;
       T t;
       R r;
       M m;
       //因为数组在new时，不能确定T的类型，无法在内存开辟空间
       //所以不能直接实例化
       //T[] ts = new T[8];//泛型不能实例化
     
       // public static void m1(M m){
       //静态方法是在类加载时，对象还没创建
       //导致JVM无法完成初始化
       //在定义时候才知道
       //所以不能为静态方法
       //}
       //构造器使用泛型
       public Tiger(String name) {
         this.name = name;
     
       }
     ```

     

- 自定义泛型接口

  `interface 接口名<T,R...>{}`

- 细节

  1. 接口中，静态成员不能使用泛型（这个和泛型类的规定一样）（接口的成员都是final和static修饰的）

  2. 泛型接口的类型，在继承接口或者实现接口时确定

  3. 没有指定接口，默认为Object 

     ```java
     interface IUsb<U,R>{
       R get(U u);
       void hi (R r);
       //在JDK8中可以实现默认方法，也可以使用泛型
       default R method(U u){
         return null;
       }
     }
     
     //在继承的时候，指定泛型接口的类型
     //U=String R=Double
     interface IA extends IUsb<String, Double>{
     
     }
     class CC implements IUsb{
       //等价于class CC implements IUsb<Object,Object>
       //但最好写成带上<Object,Object>
       //不写这个不太规范
     }
     ```

- 自定义泛型方法

  1. 泛型方法，可以定义在普通类中，也可以在定义在泛型类中

  2. 当泛型方法被调用时，类型会确定

  3. `public void eat(E e){}`修饰符后没有<T,R>eat方法不是泛型方法，而是使用了泛型

     ```java
     class Car{
       public void run(){
         //普通方法
       }
       //1.<T,R>就是泛型
       //2.是提供给fly方法使用的
       public <T,R> void fly(T t, R r){
         //泛型方法
       }
     }
     class Fish<T,R>{
       //泛型类
       public void run (){
         //普通方法
       }
       public<U,M> void eat(U u, M m ){
         //泛型方法
         //当传入参数时，编译器，就会自动确定类型
       }
     }
     public void hi (T t){
       //这个方法不是泛型方法
       //而是使用了类声明的泛型
     }
     //泛型方法，可以使用类声明的泛型，也可以使用自己声明方法
     public <K> void hello(R r, K k){
       System.out.println(r.getClass());
       System.out.println(k.getClass());
     }
     ```

- 泛型的继承和通配符

  1. 泛型不具有继承性

     `List<Object>list = new ArrayList<String>();//错误`

  2. <?>：支持任意泛型类型

  3. <? extends A>：支持A类以及A类的子类，规定了泛型的上限

  4. <? super A>:支持A类以及A类的父类，不限于直接父类，规定了泛型的下限

  ```java
  ArrayList<Object> list1 = new ArrayList<>();
  ArrayList<String> list2 = new ArrayList<>();
  ArrayList<AA> list3 = new ArrayList<>();
  ArrayList<BB> list4 = new ArrayList<>();
  ArrayList<CC> list5 = new ArrayList<>();
  
  //<?>可以传入任何类型
  printCollection1(list1);//T
  printCollection1(list2);//T
  printCollection1(list3);//T
  printCollection1(list4);//T
  printCollection1(list5);//T
  
  printCollection2(list1);//F
  printCollection2(list2);//F
  printCollection2(list3);//T
  printCollection2(list4);//T
  printCollection2(list5);//T
  
  printCollection3(list1);//T
  printCollection3(list2);//F
  //list2是String不是AA的子类。或者本类
  printCollection3(list3);//T
  printCollection3(list4);//F
  printCollection3(list5);//F
  
  public static void printCollection1(List<?> c){}
  public static void printCollection2(List<?extends AA> c){}
  public static void printCollection3(List<? super AA> c){}
  
  class AA{}
  class BB extends AA{}
  class CC extends BB{}
  ```
  
  



## 14.线程

### 14.1.进程

1. 进程是指运行中的程序，比如我们使用QQ，就启动了一个进程，操作系统分配内存空间们，当我们再次启动一个进程，操作系统就会再次分配新的空间
2. 进程是程序的一次执行过程，或是正在运行的一个程序，是动态过程，它自身有产生，存在和消亡的过程

- 什么是线程
  1. 线程是由进程创建的，是进程的一个实体
  2. 一个进程可以拥有多个线程
  3. 单线程：同一个时刻，只允许执行一个线程
  4. 多线程：同一个时刻，可以执行多个线程，比如：一个qq线程，可以同时打开多个线程，一个迅雷进程，可以同时下载多个文件
- 并发和并行
  1. 并发：同一时刻多个任务交替进行，就是在某一时间点上，只执行了一个线程，单核CPU实现的多任务就是并发
  2. 并行：同一时刻，多个任务同时执行，多核CPU可以实现并行，并行和并发。



### 14.2.线程的基本使用

1. 继承Thread类,重写run方法

   ```java
   Cat cat = new Cat();
   cat.start();//启动线程
   
   //为什么不直接调run方法
   //而是使用start方法 ?
   
   cat.run();
   //如果直接调用run方法,就是main主线程执行的
   //而不是创建一个子线程执行的
   //必须执行完这个run方法
   //才能继续执行下面的代码
   
   //当main线程启动一个子线程 Thread-0
   //主线程不会阻塞,会继续执行
   
   
   System.out.println(Thread.currentThread().getName());
   //主线程名称
   for (int i = 0; i < 20; i++) {
     System.out.println("主线程1=" + i);
   
     try {
       Thread.sleep(900);
     } catch (InterruptedException e) {
       throw new RuntimeException(e);
     }
   }
   class Cat extends Thread{
     //继承Thread类,可以当做线程使用
   
     @Override
     public void run() {
       int times = 0;
       do {
         //每隔一秒,输出语句
         System.out.println("子线程1="+times);
         times++;
         try {
           Thread.sleep(1000);
         } catch (InterruptedException e) {
           throw new RuntimeException(e);
         }
         //ctrl+alt+t
         //这里try-catch是保证该线程在sleep时还能感知相应
         //能够相应中断,不会睡死
       } while (times != 20);
     }
   }
   ```

   ```java
   //线程的start底层代码
    public synchronized void start() {
     //简化源码
      //底层是调用start0()方法
      start0();
    }
   private native void start0();
   //start0()是本地方法,是jvm调用,底层是C/C++实现的
   //真正实现多线程的效果是start0(),而不是run
   ```

2. 实现Runnable接口,重写run方法

   ```java
   //使用Runnable接口
   //使用Runnable来开启多线程模式
   Dog dog = new Dog();
   //dog.run();
   //创建了Thread对象,把对象实现Runnable,放入Thread
   Thread thread = new Thread(dog);
   thread.start();
   //底层使用了设计模式[代理模式]
   //代码模拟,实现了Runnable接口
   
   //静态代理模式
   Tiger tiger = new Tiger();//模拟实现Runnable
   ThreadProxy threadProxy = new ThreadProxy(tiger);
   threadProxy.start();
   
   class Tiger extends Thread{
     int i = 0;
     @Override
     public void run() {
       while (i != 10) {
         System.out.println("~" + (++i));
       }
     }
   }
   
   class ThreadProxy implements Runnable{
     //模拟实现Runnable接口
     private Runnable target = null;
     @Override
     public void run() {
       if (target != null) {
         target.run();//动态绑定
         //一开始赋值target =null
         //但是new Thread(Tiger)
         //这个target为Tiger
         //当调到这个run方法时
         //就动态绑定到Tiger重写的run方法;
       }
     }
     public ThreadProxy(Runnable target){
       this.target = target;
     }
     public void start(){
       start0();
       //这个方法是真正实现多线程方法的
     }
     public void start0(){
       run();
     }
   }
   ```

3. Thread和Runnable的区别

   1. 本质上没有区别
   2. 实现Runnable接口方式更加适合多个线程共享一个资源的情况,避免了单继承继承机制**建议使用Runnable机制**

4. **第三种创建线程的方法实现Callable接口**





### 14.3.线程终止

需要启动一个线程,然后再去结束这个线程

```java

T t = new T();
t.start();
System.out.println("线程开始");
try {
  Thread.sleep(3300);
} catch (InterruptedException e) {
  throw new RuntimeException(e);
}
t.setLoop(false);
System.out.println("结束线程");


class T extends Thread{
  private boolean loop = true;

  @Override
  public void run() {
    while (loop) {
      System.out.println("123");
    }
  }

  public void setLoop(boolean loop){
    this.loop = loop;
  }
}
```





### 14.4.线程常用方法

1. setName:设置线程名称,使之与参数name相同
2. getName:返回线程的名称
3. start:使该线程开始执行;java虚拟机底层调用该线程的start0()方法
4. run:调用线程对象run方法
5. setPriority:更改线程优先级
6. getPriority:获取线程的优先级
7. sleep:在指定的毫秒数内让当前正在执行的线程休眠
8. interrupt:中断线程

- 细节

  1. start底层会创建新的线程,调用run,run就是一个简单的方法调用,不会启动新线程

  2. 线程优先级的范围

     ```java
     public final static int MIN_PRIORITY = 1;
     public final static int NORM_PRIORITY = 5;
     public final static int MAX_PRIORITY = 10;
     ```

  3. Interrupt,中断线程,但没有真正的结束线程,所以一般用于中断正在休眠线程

  4. sleep:线程的静态方法,使当前线程休眠

9. yield:线程的礼让,让出cpu,让其他线程执行,但礼让时间不确定,所以也不一定礼让成功

10. join:线程的插队,插队的线程一旦插队成功,则肯定,先执行完插入的线程的所有任务

    ```java
    package Thread_;
    
    public class joinThread {
      public static void main(String[] args) throws InterruptedException {
    
        TT tt = new TT();
        tt.start();
    
        for (int i = 1; i <= 20; i++) {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          Thread.yield();
          System.out.println("主线程吃"+i);
          if (i == 4){
            System.out.println("让子线程");
            tt.join();//让子线程插队
            System.out.println("主线程继续");
          }
        }
      }
    }
    class TT extends Thread{
      int i = 0;
    
    
      @Override
      public void run() {
        while (i!=20) {
          try {
            Thread.sleep(300);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          System.out.println("子线程=" + (++i));
        }
      }
    }
    ```

    ```java
    package Thread_;
    
    public class ThreadMethodExercise {
      public static void main(String[] args) throws InterruptedException {
        Hello hello = new Hello();
        Thread thread = new Thread(hello);
        for (int i = 0; i < 10; i++) {
          System.out.println("hi"+" "+(i+1));
          if (i == 4){
            thread.start();
            //如果这里只是开始子线程
            //并不会先执行子线程
            //而是等main线程执行完毕
            //子线程就会继续执行
            thread.join();
          }
        }
        System.out.println("主线程结束");
      }
    }
    class Hello implements Runnable{
      int i =  0;
      @Override
      public void run() {
        while (i!=10){
          try {
            Thread.sleep(110);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
          System.out.println("hello"+" "+(++i));
        }
        System.out.println("子线程结束");
      }
    }
    ```




- 用户线程和守护线程

  1. 用户线程也叫工作线程,当线程的任务执行完或通知方式结束
  2. 守护线程:一般是工作线程服务的,当所有的用户线程结束,守护线程自动结束
  3. 常见的守护线程:垃圾回收机制

  ```JAVA
  //守护线程
  //守护线程就是 和其他线程一起
  //如果其他线程都结束了
  //守护线程也会结束
  
  public class DaemonThread_ {
    public static void main(String[] args) throws InterruptedException {
  
      MyDaemonThread myDaemonThread = new MyDaemonThread();
      myDaemonThread.setDaemon(true);
      //这个setDaemon必须在start的前面
      //否则报错
      myDaemonThread.start();
      for (int i = 0; i < 10; i++) {
        Thread.sleep(1_000);
        System.out.println(i);
      }
    }
  }
  class MyDaemonThread extends Thread{
  
    @Override
    public void run() {
      for (;;){
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println("!!!");
      }
    }
  }
  ```






### 14.5.线程的生命周期

```java
package Thread_;
public class State {
  public static void main(String[] args) throws InterruptedException {
    T1 t1 = new T1();
    System.out.println(t1.getName()+"  "+ t1.getState());
    t1.start();

    while (Thread.State.TERMINATED != t1.getState()){
      System.out.println(t1.getName()+"  "+ t1.getState());
      Thread.sleep(600);
    }
    System.out.println(t1.getName()+"  "+ t1.getState());
    /**
         * Thread-0  NEW 						创建
         * Thread-0  RUNNABLE				运行
         * Thread-0  TIMED_WAITING	等待
         * Thread-0  TERMINATED 		结束
         */
  }
}
class T1 extends Thread{
  int i = 0;
  @Override
  public void run() {
    while (true){
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("123");
      i++;
      if (i == 10){
        break;
      }
    }
  }
}
```

**<a href="https://smms.app/image/S2MmrJ8QL34Vjkh" target="_blank"><img src="https://s2.loli.net/2024/01/06/S2MmrJ8QL34Vjkh.png" ></a>**





### 14.6.Synchronized

- 线程同步机制

  1. 在多线程编程,一些敏感数据部允许被多个线程同时访问,此时就使用同步访问技术,保证数据在任何同一时刻,最多有一个线程访问,以保证数据的完整性
  2. 线程同步,既当有一个线程在对内存进行操作时,其他线程都不可以对这个内存地址进行操作,直到该线程完成操作,其他线程才能对该内存地址进行操作

- Synchronized

  1. 同步代码块

     ```java
     synchronized (对象){
       //得到对象的锁,才能操作同步代码
       //需要被同步代码;
       
     }
     ```

  2. synchronized还可以放在方法声明中,表示整个方法为同步方法

     ```java
     public synchronized void m (String)name{
       //需要被同步的代码
     
     ```

  ```java
  //实例
  Windows1 windows1 = new Windows1();
  Thread thread = new Thread(windows1);
  Thread thread1 = new Thread(windows1);
  Thread thread2 = new Thread(windows1);
  thread1.start();
  thread.start();
  thread2.start();
  
  class Windows1 implements Runnable{
   static int tickets = 50;
  
    @Override
    public synchronized void run() {
      while (tickets > 0) {
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        System.out.println("还剩余tickets=" + (--tickets));
      }
    }
  }
  ```



### 14.7.互斥锁

1. java中,引入了对象互斥锁的概念,来保证共享数据操作的完整性

2. 每个对象都对应一个可称为“互斥锁”的标记,这个标记用来保证在这一时刻,只能有一个线程访问该对象

3. 关键字synchronized来与对象的互斥锁的联系,当某个对象用synchronized修饰时,表明该对象在任一时刻只能有一个线程来访问

4. 同步的局限性:导致程序的执行效率要降低

5. **同步方法(非静态的)的锁可以是this,也可以是其他对象的(要求是同一个对象)**

6. **同步方法(静态的)的锁为当前类本身的**

   ```java
   Windows1 windows1 = new Windows1();
   new Thread(windows1).start();
   new Thread(windows1).start();
   new Thread(windows1).start();
   
   class Windows1 implements Runnable {
     private static int tickets = 1110;
     boolean loop = true;
   
     public static synchronized void m1() {
       //如果这个锁加在这个静态方法上
       //那么这个锁相当于加在了这个Windows1.class上
       //与this无关
     }
   
     public static void m2() {
       //synchronized (this){}
       //这里this就不对了
       //只能写这个类的类名
       //也就是Windows1.class
       //因为 哪个对象调用，就是哪个对象的this
       //但是这是静态方法
       //可能没有对象调用
       //所以这个this不知道指谁
       synchronized (Windows1.class) {
         System.out.println("m2");
       }
     }
     Object object = new Object();//这是一个Object对象
     public void run() {
       //当这个三个线程同时调用这个方法时
       //其中一个对象进入sell方法
       //其他俩个就会被锁外面
       //就不能进入这个方法
       //需要等那个对象出来
       //如果我们直接把循环写在这个锁里面
       //就会导致这个进程一直在里面
       //出不来,直到进程结束,才会出来
       //所以这个while循环只能写在外面
       while(loop) {
         sell();
       }
     }
     public /*synchronized*/void sell(){//在这里加synchronized是加的方法锁
       //这个锁是在这个this对象
       //也可以子啊代码块里面加锁,
       synchronized (/*this*/object){//在这里加的是同步代码块锁
         //还是加在this对象
         //由于在这里调用的都是这个方法
         //所以这个对象都是object对象
         //也就是同一个对象
         if (tickets <=0){
           loop = false;
           return;
         }
         try {
           Thread.sleep(1);
         } catch (InterruptedException e) {
           throw new RuntimeException(e);
         }
         System.out.println(Thread.currentThread().getName());
         System.out.println("还剩余tickets=" + (--tickets));
       }
     }
   }
   ```

- 互斥锁的细节

  1. 同步方法如果没有使用static修饰:默认锁的对象为this(也就是哪个对象调用,就是哪个对象)

  2. 如果方法没有使用static修饰,默认锁对象:当前类.class

  3. 需求分析:

     1. 先分析需要上锁的代码
     2. 选择同步代码块或同步方法
     3. 要求多个线程的锁对象为同一个即可

     ```java
     Windows1 windows1 = new Windows1();
     new Windows1().start();
     new Windows1().start();
     new Windows1().start();
     //这三个代码为不同对象
     //所以这锁没用
     
     Windows1 windows1 = new Windows1();
     new Thread(windows1).start();
     new Thread(windows1).start();
     new Thread(windows1).start();
     //这三个代码为同一个对象
     
     
     class Windows1 extends Thread{
       private  int tickets = 40;
     
       //2024年1月6日16:38:14
       boolean loop = true;
       Object object = new Object();//这是一个Object对象
     
       public static synchronized void m1() {
         //如果这个锁加在这个静态方法上
         //那么这个锁相当于加在了这个Windows1.class上
         //与this无关
       }
       public static void m2() {
         //synchronized (this){}
         //这里this就不对了
         //只能写这个类的类名
         //也就是Windows1.class
         //因为 哪个对象调用，就是哪个对象的this
         //但是这是静态方法
         //可能没有对象调用
         //所以这个this不知道指谁
         synchronized (Windows1.class) {
           System.out.println("m2");
         }
       }
       public void run() {
         while(loop) {
           sell();
         }
       }
       public /*synchronized*/void sell(){//在这里加synchronized是加的方法锁
         //这个锁是在这个this对象
         //也可以子啊代码块里面加锁,
         synchronized (this/*object*/){//在这里加的是同步代码块锁
           //还是加在this对象
           //如果都是object对象
           //由于在这里调用的都是这个方法
           //所以这个对象都是object对象
           //也就是同一个对象
           if (tickets <=0){
             loop = false;
             return;
           }
           try {
             Thread.sleep(51);
           } catch (InterruptedException e) {
             throw new RuntimeException(e);
           }
           System.out.println(Thread.currentThread().getName());
           System.out.println("还剩余tickets=" + (--tickets));
         }
       }
     }
     ```



### 14.8.线程的死锁

- 介绍

  多个线程都占用了对方的锁资源,但不肯相让,导致了死锁,在编程是一定要避让死锁的发生

  ```JAVA
  package Thread_;
  
  public class DeadLock {
    public static void main(String[] args) {
  
      DeadLockDemo deadLockDemo1 = new DeadLockDemo(false);
      deadLockDemo1.setName("线程1");
      DeadLockDemo deadLockDemo2 = new DeadLockDemo(true);
      deadLockDemo2.setName("线程2");
      deadLockDemo1.start();
      deadLockDemo2.start();
      /**
           * 线程2进入1
           * 线程1进入3
           */
    }
  }
  class DeadLockDemo extends Thread{
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;
    public DeadLockDemo(boolean flag){
      this.flag = flag;
    }
  
    @Override
    public void run() {
      if (flag){
        synchronized (o1){
          System.out.println(Thread.currentThread().getName()+"进入1");
          synchronized (o2){
            System.out.println(Thread.currentThread().getName()+"进入2");
          }
        }
      }else{
        synchronized (o2){
          System.out.println(Thread.currentThread().getName()+"进入3");
          synchronized (o1){
            System.out.println(Thread.currentThread().getName()+"进入4");
          }
        }
      }
    }
  }
  ```



### 14.9.释放锁

- 下面操作会释放锁

1. 当线程的同步方法,同步代码块执行结束
2. 当前线程在同步代码块,同步方法中遇到break,return.
3. 当前线程在同步代码块,同步方法中出现了未处理的Error或Exception,导致异常结束
4. 当前线程在同步代码块,同步方法中执行了线程对象的wait()方法,当前线程暂停,并释放锁

- 下面操作不会释放锁

1. 线程执行同步代码块或者同步方法时,程序调用Thread.sleep();Thread.yield()方法暂停当前线程的执行,不会释放锁
2. 线程执行同步代码块时,其他线程调用了该线程的suspend()方法将该线程挂起,该线程不会释放锁
3. 尽量避免使用suspend()和resume()来控制线程,方法不再推荐使用





## 15.IO流

### 15.1.文件流

文件就是**保存数据的地方**

文件在程序中是以流的形式来操作的

流:数据在源(文件)和程序(内存)之间的经历的路径

输入流:数据从源(文件)到程序(内存)的路径

输出流:数据从程序(内存)到数据源(文件的)的路径 

<a href="https://smms.app/image/1qreSPtoTuN2Ysf" target="_blank"><img src="https://s2.loli.net/2024/01/08/1qreSPtoTuN2Ysf.png" ></a>



### 15.2.常用的文件操作

- 创建文件对象相关构造器和方法

  `new File(String pathname);//根据路径构建一个File对象`

  `new File(File parent,String child);//根据父目录文件+子路径构建`

  `new File(String parent,String child);//根据父目录+子路径构建`

  `creatNewFile `

  ```java
  //三种创建file文件的方法
  //1. new File(String pathname)
  @Test
  public void creat1(){
  
    String filePath = "d:\\news1.txt";
    File file = new File(filePath);
    try {
      file.createNewFile();
      System.out.println("创建成功1");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  //2.new File(File parent,String child)
  //d:\\new2.txt
  @Test
  public void creat2(){
    File parentfile = new File("d:\\");
    //这个是在内存中
    //并不是真正的创建
    String fileName = "news2.txt";
    File file1 = new File(parentfile, fileName);
    try {
      file1.createNewFile();
      //当执行creatNewFile到这个语句时
      //才会在磁盘创建该文件
      System.out.println("创建成功2");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  //3.new File(String parent,String child)
  @Test
  public void creat3(){
    String parentName = "d:\\";
    String fileName = "news3.txt";
    File file = new File(parentName, fileName);
    try {
      file.createNewFile();
      System.out.println("创建成功3");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  ```

- 获取文件的相关信息

  ```java
  //创建文件对象
  File file = new File("d:\\news1.txt");
  
  //调用相应的方法去实现
  System.out.println("文件的名字="+file.getName());//文件的名字=news1.txt
  
  //得到绝对路径
  System.out.println("绝对路径:"+file.getAbsoluteFile());//绝对路径:d:\news1.txt
  
  //得到文件父级目录
  System.out.println("文件父级目录:"+file.getParent());//文件父级目录:d:\
  
  //得到文件大小
  System.out.println("文件大小:"+file.length());//文件大小:12
  
  //判断文件是否存在
  System.out.println("文件是否存在:"+file.exists());//文件是否存在:true
  
  //是不是一个文件
  System.out.println("是不是一个文件:"+file.isFile());//是不是一个文件:true
  
  //是不是一个文件
  System.out.println("是不是一个目录:"+file.isDirectory());//是不是一个目录:false
  ```

- 创建文件和目录

  ```java
  @Test
  public void m1(){
    //判断D盘是否存在news1
    //如果存在删除
    String fileName = "d:\\news1.txt";
    File file = new File(fileName);
    try {
      file.createNewFile();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  
    if(file.exists()){
      if (file.delete()) {
        System.out.println("删除成功");
      }else{
        System.out.println("删除失败");
      }
    }else{
      System.out.println("该文件不存在");
    }
  
    //删除成功
  
  
  }
  @Test
  public void m2(){
    //判断d:\\demo02.txt是否存在,存在就删除,否则提示不存在
    //在java中,目录也是一种文件
    String fileName = "d:\\demo02";
    File file = new File(fileName);
    if(file.exists()){
      if (file.delete()) {
        System.out.println(file+"删除成功");
      }else{
        System.out.println(file+"删除失败");
      }
    }else{
      System.out.println("该目录不存在");
    }
  
    //d:\demo02删除成功
  
  }
  
  @Test
  public void m3(){
    String directoryPath = "d:\\demo02\\a\\b\\c";
    File file = new File(directoryPath);
    if(file.exists()){
      System.out.println("该目录存在");
    }else{
      //创建多级目录
      if ( file.mkdirs()){
        System.out.println(directoryPath+"创建成功");
      }else{
        System.out.println(directoryPath+"创建失败");
      }
    }
    //d:\demo02\a\b\c创建成功
    //file.mkdirs()是创建多级目录
    //file.mkdir()是创建一级目录
  }
  ```

  



### 15.3.IO流原理和分类

- Java IO流原理
  1. I/O是Input/Output的缩写,I/O技术是非常实用的技术,用于处理数据传输,如读/写文件,网络通讯等
  2. Java程序中,对于数据的输入/输出操作以“流(stream)”的方式进行
  3. Java.io包下提供了各种“流”类和接口,用以获取不同种类的数据,并通过方法输入和输出数据
  4. 输入Input:读取外部数据(磁盘,光盘等存储设备的数据)到程序(内存)中.
  5. 输出output:将程序(内存)数据输出到磁盘,光盘等存储设备中

- 流的分类

  按操作数据单位不同分为:字节流(8bit)(二进制文件),字符流(按字符)(文本文件)(文本文件本质也是二进制文件)

  按数据流的流向不同分为:输入流,输出流

  按流的角色的不同分为:节点流,处理流/包装流

  | (抽象基类) | 字节流       | 字符流 |
  | ---------- | ------------ | ------ |
  | 输入流     | InputStream  | Reader |
  | 输出流     | OutputStream | Writer |

  1. Java的IO流共涉及40多个类,实际上非常规则,都是从如上4个类抽象基类派生的
  2. 由这四个类派生出来的子类名称都是以其父类名作为子类名后缀的



### 15.4.IO流体系图

- InputStream:字节输入流

  InputStream抽象类是所用类字节输入流的超类

- InputStream常用的子类

  1. FileInputStream:文件输入流
  2. BufferedInputStream:缓冲字节输入流
  3. ObjectInputStream:对象字节输入流

  ```java
  @Test
  public void readFile01(){
    FileInputStream fileInputStream = null;//扩大作用域
    String filePath = "d:\\new2.txt";
    int read = 0;
    try {
      //创建对象
      //用于读取对象
      fileInputStream = new FileInputStream(filePath);
      //从该输入流读取一个字节的数据,
      // 如果返回-1,表示读取完毕
      while ((read = fileInputStream.read()) != -1) {
        System.out.print((char)read);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally {
      //必须关闭这个流
      //这个流是一种资源
      //如果都不关闭,会造成资源浪费
      try {
        fileInputStream.close();
      } catch (IOException e) {
        throw new RuntimeException();
      }
      /**
               *输出效果
               * hello,world!
               */
    }
  }
  
  /**
       * 使用更加高效的方法去读取
       */
  @Test
  public void readFile02(){
    FileInputStream fileInputStream = null;//扩大作用域
    String filePath = "d:\\new2.txt";
    byte[] buf = new byte[8];
    int readLen = 0;
    try {
      //创建对象
      //用于读取对象
      fileInputStream = new FileInputStream(filePath);
      //从该输入流读取最多b.length字节的数据到字节数组中,此方法将阻塞,
      //如果返回-1,表示读取完毕
      //如果读取正常,返回实际读取的字节数
      while ((readLen = fileInputStream.read(buf)) != -1) {
        System.out.print(new String(buf,0,readLen));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally {
      //必须关闭这个流
      //这个流是一种资源
      //如果都不关闭,会造成资源浪费
      try {
        fileInputStream.close();
      } catch (IOException e) {
        throw new RuntimeException();
      }
      /**
               *输出效果
               * hello,world!浣犲ソ
               */
    }
  }
  ```

- FileOutputStream应用实例

  ```java
  @Test
  public void m1(){
    String filePath = "d:\\a.txt";
    FileOutputStream fileOutputStream = null;
  
    try {
  
      //1.new FileOutputStream(filePath)是覆盖 当写入内容时 会覆盖原来的内容
      //2.new FileOutputStream(filePath,true)创建方法 当写入内容时 是追加到文件后面
      //创建对象
      fileOutputStream = new FileOutputStream(filePath,true);
  
      //写入对象(一个字节)
      fileOutputStream.write('\n');
  
      //写入多个字节
      String str = "hello.world";
      //str.getBytes() 可以把字符串->字节数组
      //fileOutputStream.write(str.getBytes());
      //fileOutputStream.write(byte[],int off, int len)将len字节从位于偏移量 off指定字节数组写入此文件输出流
      fileOutputStream.write(str.getBytes(),0,4);//hell
    } catch (IOException e) {
      throw new RuntimeException(e);
    }finally {
      try {
        //关闭输出流
        fileOutputStream.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
  ```

- 复制图片

  ```java
  //1.创建文件输入流,将文件读写到程序
  //2.创建文件输出流,将读取的文件数据,写入指定的文件
  String srcFilePath ="d:\\1.jpg";
  String desFilePath ="d:\\2.jpg";//复制
  //String desFilePath ="f:\\kola.jpg";
  
  FileInputStream fileInputStream = null;
  FileOutputStream fileOutputStream =null;
  
  try {
    fileInputStream = new FileInputStream(srcFilePath);
    fileOutputStream = new FileOutputStream(desFilePath);
  
    //定义一个字节数组,提高效率
    byte[] buf =  new byte[1024];
    int readLen = 0;
    while ((readLen = fileInputStream.read(buf))!= -1){
      //边读边写
      fileOutputStream.write(buf,0,readLen);
      //fileOutputStream.write(buf);可能会造成文件损失
      //一定使用这个方法
    }
    System.out.println("success!");
  } catch (IOException e) {
    e.printStackTrace();
  }finally {
    try{
      //关闭输入流和输出流 节省资源
      if(fileInputStream!=null){
        fileInputStream.close();
      }
      if (fileOutputStream!=null);
      fileOutputStream.close();
    }catch (IOException e){
      e.printStackTrace();
    }
  }
  ```

- FileReader和FileWriter

  FileReader和FileWriter是字符流,既按照字符来操作IO

- FileReader相关方法

  1. new FileReader(File/String):覆盖模式,相当于流的指针在首端

  2. read:每次读取单个字符,返回该字符,如果到文件末尾就返回-1

  3. read(char[]):批量读取多个字符到数组,返回读取到的字符数,如果到文件末尾返回-1

  4. new String(char[]):将char[]转换成String

  5. new String(char[],off,len):将char[]的指定部分转换成String

  6. new FileReader(File/String,true):追加模式,相当于流的指针在尾端

  7. write(int):写入单个字符

  8. writer(char[]):写入指定的数组

  9. writer(char[],off,len):写入指定数组的指定部分

  10. writer(String):写入整个字符串

  11. writer(String,off,len):写入字符串的指定部分

  12. String类:toCharArray:将String转换成char[]

  13. **注意:FileWriter使用后,必须要关闭(close)或刷新(flush),否则写入不到指定的文件**

      ```JAVA
      @Test
      public void FileReader1(){
        //1.创建对象
        String fileName = "d:\\new3.txt";
        FileReader fileReader = null;//初始化
        int date = 0;
        try {
          fileReader = new FileReader(fileName);
      
          //读取字符
          //1.read 循环读取
          while ((date = fileReader.read())!=-1){
            System.out.print((char)date);
          }
      
        } catch (IOException e) {
          e.printStackTrace();
        }finally {
          //读取完之后 关闭流
          try {
            fileReader.close();
            System.out.println("读取完毕");
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
      
      @Test
      public void FileReader2(){
      
        //1.创建对象
        String fileName = "d:\\new1.txt";
        FileReader fileReader = null;//初始化
        int readLen = 0;
        char[] buf = new char[8];
        try {
          fileReader = new FileReader(fileName);
      
          //读取字符
          //1.read 循环读取
          while ((readLen = fileReader.read(buf))!=-1){
            System.out.print(new String(buf,0,readLen));
          }
        } catch (IOException e) {
          e.printStackTrace();
        }finally {
          //读取完之后 关闭流
          try {
            fileReader.close();
            //fileReader.flush()+关闭 = fileReader.close();
            System.out.println("读取完毕");
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
      
      @Test
      public void FileWriter(){
      
        String filePath = "d:\\new3.txt";
        //创建FileWriter对象
        FileWriter fileWriter = null;
      
        try { 
          fileWriter =new FileWriter(filePath,true);
          //写入单个字符
          fileWriter.write(90);
          fileWriter.write('z');
          //写入指定数组
          char[] chars = {'\n','a','b','c'};
          fileWriter.write(chars);
          //写入数组的指定部分
          fileWriter.write("\nabcdefg".toCharArray(),0,5);
          //写入整个字符串
          fileWriter.write("\n你好");
      
        } catch (IOException e) {
          e.printStackTrace();
        }finally {
          //一定要关闭流,或者flush流
          //才能真正的写入
          try {
            fileWriter.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
      ```
      
      ```java
      public FileOutputStream(File file) throws FileNotFoundException {
        this(file, false);
      }
      //默认为false
      //所以如果要追加而不是覆盖
      //需要写上true
      //new FileWriter(filePath,true);
      ```
      
      



### 15.5.节点流和处理流

#### 15.5.1.BufferedReader和BufferedWriter

1. 节点流可以从一个特定的数据源读写数据,如FileReader,FileWriter

2. 处理流,也叫**包装流**(修饰器模式),是“连接”存在的流(节点流或处理流)之上,为程序提供更为强大的读写功能,如BufferReader,BufferWriter等

   <a href="https://smms.app/image/AqznZNPWuQycres" target="_blank"><img src="https://s2.loli.net/2024/01/08/AqznZNPWuQycres.png" ></a>

   ```java
   public class BufferedWriter extends Writer {
     //源代码的一部分
     private Writer out;
     //在BufferedWriter中写了一个Writer类的out
     //是用来获取OutputStream,PipedWriter,StringWriter,CharArrayWriter类
     //由于Writer都是OutputStream,PipedWriter,StringWriter,CharArrayWriter类的父类
     //可从多态体系出来向上转型和向下转型
     //所以这个out是用来操作任意数据源,而不只是体现在自己的数据源上
     //这个out可以去调用其他跟它同级的数据源OutputStream,PipedWriter,StringWriter,CharArrayWriter类,这些类
     //这也叫包装流
   }
   ```

- 节点流和处理流的区别和联系
  1. **节点流是底层流/低级流,直接跟数据源相连接**
  2. 处理流(包装流)**包装节点流**,既可以消除不同节点流的实现差异,也可以提供更方便的方法来完成输入输出
  3. **处理流对节点流进行包装**,使用了修饰器设计模式,不会直接与数据源相连
  
- 处理流的功能的主要体现在以下俩个方面

  1. 性能的提高;主要以增加缓冲的方式来提高输入输出的效率
  2. 操作的便携:处理流可能提供了一系列便携的方法来一次输入输出大批量的数据,使用更加灵活方便

  **关闭处理流时,会自动关闭节点流**

```java
String filePath = "d:\\new1.txt";
BufferedReader bufferedReader = null;
//创建bufferReader
try {
  bufferedReader = new BufferedReader(new FileReader(filePath));
  /**
             *  public void close() throws IOException {
             *         synchronized (lock) {
             *             if (in == null)
             *             这个in就是我们传进的 new FileReader(filePath)
             *                 return;
             *             try {
             *                 in.close();
             *             } finally {
             *                 in = null;
             *                 cb = null;
             *             }
             *         }
             *     }
             */
  //读取一行
  String line;
  //返回null表示文件读取完毕
  while ((line = bufferedReader.readLine())!= null){
    System.out.println(line);
  }
} catch (IOException e) {
  e.printStackTrace();
}finally {
  //关闭流只需要关闭bufferReader就自动关闭节点流了
  try {
    bufferedReader.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
  System.out.println("你好");
}
```

```java
//文件的拷贝
//完成文件的拷贝
String firstPath = "d:\\new5.txt";
String secondPath = "d:\\new6.txt";
//BufferedReader和BufferedWriter是安装字符操作
//不要去操作这个二进制文件,可能会造成文件的损坏
BufferedReader bufferedReader = new BufferedReader(new FileReader(firstPath));
BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(secondPath));

String line;
//边读边写
while((line = bufferedReader.readLine())!=null){
  bufferedWriter.write(line);
  bufferedWriter.newLine();
}

bufferedReader.close();
bufferedWriter.close();
```

**BufferedReader和BufferedWriter是按照字符操作**

**不要去操作这个二进制文件,可能会造成文件的损坏,比如图片,声音,音乐等**

- BufferedOutputStream

  BufferedOutputStream是字节流,实现缓冲的输出流,可以将多个字节写入底层输出流中,而不必每次字节写入调用底层系统**(可以对二进制文件进行操作)**

```java
class BufferedInputStream extends FilterInputStream {}
class FilterInputStream extends InputStream {
  protected volatile InputStream in;//1
}
//BufferedInputStream和BufferedOutputStream中
//他们包装起来的对象是从父类继承下来的
//这一点是与BufferedWriter和BufferReader有点不同的
```

```java
//实例
String music = "d:\\music.wav";
String musicCopy = "d:\\music2.wav";
BufferedInputStream bufferedInputStream = new BufferedInputStream(Files.newInputStream(Paths.get(music)));
BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get(musicCopy)));

byte[] c1 = new byte[1024];
int readLine = 0;
while ((readLine = bufferedInputStream.read(c1))!= -1){
  bufferedOutputStream.write(c1,0,readLine);
}
bufferedInputStream.close();
bufferedOutputStream.close();
//这种是不会使这个二进制文件造成损害
```

#### 15.5.2对象流-ObjectInputStream和ObjectOutStream

序列化和反序列化:

1. 序列化就是在保存数据时,**保存数据的值和数据类型**
2. 反序列化就是在恢复数据时,**恢复数据的值和数据类型**
   
   需要让某个对象支持序列号机制,则必须让其类是可序列化的,为了让某个类是可序列化的,该类**必须实现Serializable(标记接口)和Externalizable**
3. **推荐选择Serializable接口,它是一个标记接口,不实现任何方法**
4. 而Externalizable这个接口需要实现方法

- 功能介绍

  1. ObjectInputStream提供反序列化功能

     它有一个构造器可以接收OutputStream,只要是OutputStream的子类都可以传进来

  2. ObjectOutputStream提供序列号功能

     它有一个构造器可以接收InputStream,只要是InputStream的子类都可以传进来

- 应用实例

  ```java
  //序列化后保存的文件格式不是存文本而是按照他的格式来保存
  String s1 = "d:\\date.dat";
  
  ObjectOutputStream objectOutputstream = new ObjectOutputStream(new FileOutputStream(s1));
  
  //序列化数据 d:\\date.txt
  objectOutputstream.writeInt(100);//int->Integer (实现了Serializable)
  objectOutputstream.writeBoolean(true);//boolean->Boolean(实现了Serializable)
  objectOutputstream.writeChar('A');//char->Character(实现了Serializable)
  objectOutputstream.writeUTF("sad!!");//String已经实现Serializable接口了
  
  //保存Dog类对象
  objectOutputstream.writeObject(new Dog("dick",12));
  
  //保存自己创建的对象时,必须要实现Serializable接口 
  //否则报错
  //关闭流
  objectOutputstream.close();
  System.out.println("数据保存完毕");
  
  class Dog implements Serializable{
    private String name;
    private int age;
  
    public Dog(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  
  
  //读取数据
  //先指定反序列化的文件
  String s1 = "d:\\date.dat";
  
  ObjectInputStream ois = new ObjectInputStream(new FileInputStream(s1));
  
  //反序列化顺序 需要和序列化顺序一致
  //否则出现异常
  
  System.out.println(ois.readInt());
  System.out.println(ois.readBoolean());
  System.out.println(ois.readChar());
  System.out.println(ois.readUTF());
  
  Object o = ois.readObject();
  System.out.println(o.getClass());
  System.out.println(o);
  
  //如果我们想要调用Dog方法,需要向下转型
  //需要我们将Dog类的定义,拷贝到 可以引用的位置
  //同一个包下不需要
  //不同的包需要
  Dog dog2 = (Dog) o;
  System.out.println("name="+ dog2.getName());
  System.out.println("age="+dog2.getAge());
  
  //关闭流
  ois.close();
  ```

- **注意事项和细节**

  1. **读写顺序要一致**

  2. **要求实现序列化或反序列化对象,需要实现Serializable**

  3. 序列化的类中建议添加SerialVersionUID,提高版本兼容性

  4. 序列号对象时,默认将里面所有属性都进行序列号,但除了static和transient修饰的成员

  5. **序列号对象时要求里面的属性的类型也需要实现序列号接口**(如果有一个属性没有序列化就会报错)

     ```java
     class Dog implements Serlizable{
       private String name;
       private Master master;
       //master没有序列化
       //所以序列化Dog时会报错
     }
     class Master{
       
     }
     ```

     

  6. **序列化具备可继承性,也就是如果某类已经实现了序列化,则它的子类已经默认实现了序列化**

#### 15.5.3.标准输入输出流

  |                    | 类型        | 默认设备 |
  | ------------------ | ----------- | -------- |
  | System.in标准输入  | InputStream | 键盘     |
  | System.out标准输出 | PrintStream | 显示器   |

  ```java
  //System 类 的 public final static InputStream in = null;
  //System.in  编译类型 InputStream
  //System.out 运行类型 BufferedInputStream
  //表示的是标准输入 键盘
  System.out.println(System.in.getClass());
  //class java.io.BufferedInputStream
  //属于字节流
  
  //System.out标准输出
  //public final static PrintStream out = null;
  //编译类型为PrintStream
  //运行类型为PrintStream
  //表示的是标准输入 显示器
  System.out.println(System.out.getClass());
  //class java.io.PrintStream
  
  
  Scanner scanner = new Scanner(System.in);
  String next = scanner.next();
  System.out.println(next);
  ```

  #### 15.5.5转换流-InputStreamReade和OutputStreamWritrer

  1. InputStreamReader:Reader的子类,可以将InputStream(字节流)包装成Reader(字符流)

     `InputStreamReader(InputStream,Charset)`

  2. OutputStreamWriter:Writer的子类,实现OutputStream(字节流)包装成Writer(字符流)

     `OutputStreamWriter(OutpuStream,Charset)`

  3. 当处理纯文本数据时,如果使用字符流效率更高,并且可以有效解决中文问题,所以建议将字节流转换成字符流

  4. 可以在使用时指定编码格式(比如UTF-8,GBK,GB2312,ISO8859-1等)

  ```java
  String s = "d:\\a.txt";
  //把FileInputStream 转换为 InputStreamReader
  InputStreamReader isr = new InputStreamReader(new FileInputStream(s),"UTF-8");
  //把InputStreamReader 转换为 BufferedReader
  BufferedReader bufferedReader = new BufferedReader(isr);
  /**合并步骤
          BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(s),"UTF-8"));
          */
  //BufferedReader里面有一个构造器就 可以接收 Reader类或者子类
  //直接转换
  //读取
  String read = bufferedReader.readLine();
  System.out.println(read);
  
  //关闭
  bufferedReader.close();
  ```

  ```java
  String s = "d:\\a.txt";
  OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(s),"gbk");
  //UTF-8/utf-8/utf8
  BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
  //转换为包装流
  bufferedWriter.newLine();
  outputStreamWriter.write("123");
  outputStreamWriter.write("你好");
  outputStreamWriter.close();
  System.out.println("保存成功");
  ```

#### 15.5.4.打印流-PrintStream和PrintWriter

**打印流只有输出流,没有输入流**

```java
PrintStream out =System.out;
//默认情况下PrintStream输出数据的位置是标准输出 既显示器

out.print("nihao");
/**底层源码 使用write方法
         * 所以我们也可以直接调用write方法 直接打印
         * public void print(String s) {
         *         if (s == null) {
         *             s = "null";
         *         }
         *         write(s);
         *     }
         */
out.write("你好啊".getBytes());
//我们可以修改打印流的输出位置/设备
/** public static void setOut(PrintStream out) {
         *         checkIO();
         *         setOut0(out);
         *     }
         *     private static native void setOut0(PrintStream out);
         *     底层代码调用了setOut0(out)的c++代码
         */

System.setOut(new PrintStream("d:\\a.txt"));
//输出位置更改到了d:\\a.txt
System.out.println("NiHao!");

out.close();
```

```java
//PrintWriter printWriter = new PrintWriter(System.out);
PrintWriter printWriter = new PrintWriter(new FileWriter("d:\\a.txt"));
printWriter.println("nihao");//nihao
printWriter.close();
```





### 15.6.Properties类

1. 专门用于读写配置文件的集合类

   配置文件的格式:

   键=值

2. 键值对不需要有空格,值不需要用引号括起来,默认是String类型

3. Properties的常见方法

   load;加载配置文件的键值对到Properties对象

   list:将数据显示到指定设备

   getProperties(key):根据键获取值

   setProperties(key,value):设置键值对到Properties对象

   store:将Properties中的键值对储存到配置文件,在idea中,保存信息到配置文件,如果含有中文,会储存到unicode码

   ```java
   //读取配置文件 ,得到ip pwd user
   String filePath = "d:\\properites.txt";
   BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
   String line =  " ";
   while ((line = bufferedReader.readLine()) != null){
     //循环一行读取
     String[] spilt = line.split("=");
     System.out.println(spilt[0]+"是:"+spilt[1]);
   }
   bufferedReader.close();
   ```

   ```java
   //properties
   
   //先创建Properties对象
   Properties properties = new Properties();
   //加载指定的配置文件
   properties.load(new FileReader("d:\\properites.txt"));
   //把k-v 显示出来
   properties.list(System.out);
   System.out.println();
   //根据key获取键值
   String key = properties.getProperty("ip");
   String pwd = properties.getProperty("pwd");
   String user = properties.getProperty("user");
   System.out.println(key);
   System.out.println(pwd);
   System.out.println(user);
   
   
   //完成对配置文件的修改
   //先创建
   Properties properties1 = new Properties();
   properties1.setProperty("charset", "gbk");
   properties1.setProperty("user", "dick");
   properties1.setProperty("pwd", "123456");
   //如果该配置文件没有这个key就是增加
   //如果有就是替换
   
   //在储存
   properties1.store(Files.newOutputStream(Paths.get("d:\\a.txt")), null);
   //comments默认是null,如果写上,就是注释
   //在这个配置文件的开头为 #......
   
   System.out.println("保存成功");
   ```



[^1-9-2024]:ending…





## 16.网络编程

### 	16.1.网络

- ip地址
  1. 用于唯一标识网络中的每台计算机
  2. ip地址表示形式:点分十进制 XX.XX.XX.XX
  3. 每个十进制的范围:0~255
  4. ip地址的组成:网络地址+主机地址:192.168.1
  5. ipv6是互联网用于取代ipv4的下一代ip协议
  
- 域名

  1. www.xxxx.com
  2. 方便记忆
  3. 将ip地址映射成域名

- 端口号

  1. 用于标识计算机上某个特定的网络程序(不能重复)

  2. 以整数形式,范围0_65535

  3. 0~1024已经被占用,比如:ssh 22,ftp 21, smtp 25,http 80.(进行网络编程不能使用0-1024端口)

  4. 常见网络程序端口号:

     tomcat:8080

     mysql:3306

     oracle:1521

     sqlserver:1433

- 网络通信协议

  TCP/IP(Transmission Control Protocol/Internet Protocol)的简写,中文译名为**传输控制协议**/因特网互连协议,又叫网络通讯协议,这个协议是Internet最基本的协议,Internet国家互连网络的基础,也就是网络层的IP协议和传输层的TCP协议组成的 	

- TCP和UDP

  1. TCP协议:传输控制协议
     1. 使用TCP协议前,须先建立TCP连接,形成传输数据通道
     2. **传输前,采用“三次握手”方式,是可靠的**
     3.  TCP协议进行通信的俩个应用进程:客户端,服务端
     4. 在连接中可进行大数据量的传输
     5. 传输完毕,**需释放已建立的连接,效率低**
  2. UDP协议:用户数据协议
     1. 将数据,源,目的封装成数据包,不需要建立连接
     2. 每个数据报的大小限制在64K内
     3. 因无需连接,故是不可靠的
     4. 发送数据结束时无需释放资源(因为不是面向连接的),速度快
     5. 举例:发短信



### 16.2.InetAddress类

- 相关方法

  1. 获取本机InetAddress对象 getLocalHost

  2. 根据指定主机名/域名获取ip地址对象getByName

  3. 获取InetAddress对象的主机号 getHostName

  4. 获取InetAddress对象的地址 getHostAddress

     ```java
     //1.获取本机的InetAddress地址
     InetAddress localHost = InetAddress.getLocalHost();
     System.out.println("localName="+localHost);
     //HJL/10.216.5.197
     
     //2.根据主机名 获取InetAddress地址
     InetAddress byName = InetAddress.getByName("HJL");
     System.out.println("host="+byName);
     
     //3.根据域名 返回一个InetAddress对象
     //获取百度的IP地址
     InetAddress address = InetAddress.getByName("www.taobao.com");
     System.out.println(address);
     //www.taobao.com/111.31.37.214
     //域名+IP
     
     //4.根据InetAddress对象,获取对应的地址
     String hostAddress = address.getHostAddress();
     System.out.println("address="+hostAddress);
     //address=111.31.37.214
     
     //5.通过InetAddress对象获取对应的主机名或者域名
     String hostName = address.getHostName();
     System.out.println("hostname="+hostName);
     //hostname=www.taobao.com
     ```



### 16.3.Socket

- 介绍
  1. 套接字(Socket)开发网络应用程序被广泛采用,以至于成为事实上的标准
  2. 通信的俩端都要有Socket,是两台机器间通信的端点
  3. 网络通信其实就是Socket间的通信
  4. Socket允许程序把网络连接当成一个流,数据在俩个Socket间通过IO传输
  5. 一般主动发起通信的应用程序属客户端,等待通信请求的为服务端
  6. Socket的理解:1.TCP编程,可靠 2.UDP编程,不可靠

### 16.4.TCP网络通信编程

1. 基于客户端—服务端的网络通信

2. 底层使用的是TCP/IP协议

3. 应用场景举例:客户端发送数据,服务端接受并显示

4. 基于Socket的TCP编程

   ```java
   //服务端
   //代表在本机9999端口监听,等待链接
   //注意:要求本机没有其他服务在监听9999
   ServerSocket serverSocket = new ServerSocket(9999);
   //serverSocket可以通过accept()返回多个socket
   System.out.println("服务端 在9999端口监听,等待连接....");
   
   //当没有客户端连接9999端口时,程序会阻塞,等待连接
   //如果有客户端连接,则会返回Socket对象,程序继续
   Socket socket =  serverSocket.accept();
   System.out.println(socket.getClass());
   //class java.net.Socket
   
   //3.通过输入流读取数据
   InputStream inputStream = socket.getInputStream();
   
   //4.IO读取
   byte[] read = new byte[1024];
   int readlen = 0;
   while((readlen = inputStream.read(read))!= -1){
     System.out.println(new String(read,0,readlen));
     //根据读到的内容显示实际长度
   }
   
   //5.关闭流
   inputStream.close();
   socket.close();
   serverSocket.close();
   
   
   
   
   
   
   
   //客户端
   //1.连接服务器
   //连接本机的9999端口,如果连接成功,返回Socket对象
   Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
   System.out.println("客户端 Socket返回="+socket.getClass());
   //class java.net.Socket
   //先运行服务端 再运行客户端
   
   //2.连接上后 生成Socket,通过socket.getOutputStream()
   OutputStream outputStream = socket.getOutputStream();
   outputStream.write("sads".getBytes());
   
   //关闭流,不让造成资源浪费
   outputStream.close();
   socket.close();
   System.out.println("客户端退出");
   ```
   
   ```java
   //服务端
   //代表在本机9999端口监听,等待链接
   //注意:要求本机没有其他服务在监听9999
   ServerSocket serverSocket = new ServerSocket(9999);
   //serverSocket可以通过accept()返回多个socket
   System.out.println("服务端 在9999端口监听,等待连接....");
   
   //当没有客户端连接9999端口时,程序会阻塞,等待连接
   //如果有客户端连接,则会返回Socket对象,程序继续
   Socket socket =  serverSocket.accept();
   System.out.println(socket.getClass());
   //class java.net.Socket
   
   //3.通过输入流读取数据
   InputStream inputStream = socket.getInputStream();
   //4.IO读取
   byte[] read = new byte[1024];
   int readlen = 0;
   while((readlen = inputStream.read(read))!= -1){
     System.out.println(new String(read,0,readlen));
     //根据读到的内容显示实际长度
   
   }
   OutputStream outputStream = socket.getOutputStream();
   outputStream.write("hi,client".getBytes());
   socket.shutdownOutput();
   //写入结束标记
   //否则机器不知道什么时候结束,就一直卡着
   
   
   //5.关闭流
   inputStream.close();
   outputStream.close();
   socket.close();
   serverSocket.close();
   
   
   
   
   
   
   //客户端
   //1.连接服务器
   //连接本机的9999端口,如果连接成功,返回Socket对象
   Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
   System.out.println("客户端 Socket返回="+socket.getClass());
   //class java.net.Socket
   //先运行服务端 再运行客户端
   
   //2.连接上后 生成Socket,通过socket.getOutputStream()
   OutputStream outputStream = socket.getOutputStream();
   outputStream.write("hi.sever".getBytes());
   socket.shutdownOutput();
   
   InputStream inputStream = socket.getInputStream();
   //4.IO读取
   byte[] read = new byte[1024];
   int readlen = 0;
   while((readlen = inputStream.read(read))!= -1){
     System.out.println(new String(read,0,readlen));
     //根据读到的内容显示实际长度
   }
   
   
   //关闭流,不让造成资源浪费
   outputStream.close();
   inputStream.close();
   socket.close();
   System.out.println("客户端退出");
   ```
   
   **必须是客户端加上shutdownOutput才可以正常退出**
   
   **write.newLine()也是一种写入标记,必须用readLine()**
   
   ```java
   //客户端
   public class SocketTCP02Client {
     public static void main(String[] args) throws IOException {
   
       //链接9999端口
   
       Socket socket = new Socket(InetAddress.getLocalHost(),9999);
   
       //发送数据
       OutputStream outputStream =socket.getOutputStream();
       BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
       bufferedWriter.write("hello,server\n");
       bufferedWriter.write("hello,server\n");
       bufferedWriter.write("hello,server");
       bufferedWriter.newLine();//插入一个换行符,表示写入的内容结束,注意:要求对方也要使用readLine()
       bufferedWriter.flush();//如果使用字符流,需要手动刷新,否则不会写入到数据通道
       socket.shutdownOutput();
       //读取发送的数据
       InputStream inputStream = socket.getInputStream();
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
       String s = null;
       while ((s = bufferedReader.readLine())!=null){
         System.out.println(s);
       }
       //结束标记
       socket.shutdownInput();
   
   
       //关闭流
       bufferedReader.close();
       socket.close();
       bufferedWriter.close();
       bufferedReader.close();//关闭外层流
   
       /**
            * nihao client
            * nihao client
            */
     }
   }
   
   
   
   
   
   
   
   //服务端
   public class SocketTCP02Server {
     public static void main(String[] args) throws IOException {
   
       //new一个9999端口
       ServerSocket serverSocket = new ServerSocket(9999);//抛出异常
       Socket socket = serverSocket.accept();//创建socket接受
   
       //接受数据
       InputStream inputStream = socket.getInputStream();
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
       String s = " ";
       while ((s = bufferedReader.readLine())!=null){
         System.out.println(s);
       }
       socket.shutdownInput();
       //发送helloClient
   
       OutputStream outputStream =socket.getOutputStream();
       BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
       bufferedWriter.write("nihao client\n");
       bufferedWriter.write("nihao client");
       bufferedWriter.flush();
       //结束标记
       socket.shutdownOutput();
   
   
       //关闭流
       socket.close();
       serverSocket.close();
       bufferedReader.close();//关闭外层流
       bufferedWriter.close();
   
       /**
            * hello,server
            * hello,server
            * hello,server
            */
     }
   }
   ```
   
   **使用字节流输出照片**
   
   ```java
   //客户端
   //接受端口
   Socket socket = new Socket(InetAddress.getLocalHost(),8888);
   //发送图片需要使用字节流 否则会有损失
   String photo = "d:\\123.png";
   //先把照片保存到一个缓冲中
   BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(photo));
   
   //创建输出流对象
   ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
   
   //创建数组读取
   byte[] buf = new byte[1024];
   int readLen = 0;
   while ((readLen = bufferedInputStream.read(buf))!=-1){
     byteArrayOutputStream.write(buf,0,readLen);
   }
   
   //用数组保存缓冲区的数据
   byte[] array = byteArrayOutputStream.toByteArray();
   
   //然后再发送
   //再通过socket获取输出流,将数组array数据发送给服务器
   BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
   bufferedOutputStream.write(arrayS);
   
   bufferedInputStream.close();
   socket.shutdownOutput();
   
   bufferedOutputStream.close();
   byteArrayOutputStream.close();
   socket.close();
   
   
   
   
   
   //服务器
   //new 8888端口
   ServerSocket serverSocket = new ServerSocket(8888);
   //使用sock接受accept
   Socket socket = serverSocket.accept();
   System.out.println("端口8888正在监听");
   
   //通过Socket得到输入流
   BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
   //创建输出流对象
   ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
   //创建数组读取
   byte[] buf = new byte[1024];
   int readLen = 0;
   while ((readLen = bufferedInputStream.read(buf))!=-1){
     byteArrayOutputStream.write(buf,0,readLen);
   }
   
   //用数组保存缓冲区的数据
   byte[] array = byteArrayOutputStream.toByteArray();
   
   //4. 将得到 bytes 数组，写入到指定的路径，就得到一个文件了
   String destFilePath = "d:\\1234.png";
   BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
   bos.write(array);
   bos.close();
   
   bufferedInputStream.close();
   socket.close();
   serverSocket.close();
   ```

- netstat指令
  1. netstat -an可以查看当前主机网络情况包括端口监听和网络连接情况
  2. netstat -an|more可以分页显示
  3. 要求在dos控制台下执行Win+R
  4. Listening表示某个端口在监听
  5. 如果有一个外部程序(客户端)连接到该端口,就会显示一条连接信息
  6. **当客户端连接到服务端后,实际上客户端也是通过一个端口和服务端进行通讯的,这个端口是TCP/IP来分配的,是不确定的,是随机的**

### 16.5.UDP网络通信编程

1. 类DatagramSocket和DatagramPacket[数据包/数据报]实际基于UDP协议网络程序
2. UDP数据报通过数据报套接字DatagramSocket发送和接受,系统不保证UDP数据报一定能够安全的送到目的地,也不确定什么时候可以抵达
3. DatagramPacket对象封装了UDP数据报,在数据报中包含了发送端的IP地址和端口号以及接收端的IP地址和端口号
4. UDP协议中每个数据报都给出了完整的地址信息,因此无须建立发送方和接受方的连接
5. 没有明确说明服务端和客户端,演变数据的发送端和接受端
6. 接受数据和发送数据是通过DatagramSocket对象完成的
7. 将数据封装到DatagramPacket对象/装包
8. 当接受到DatagramPacket对象,需要进行拆包,取出数据
9. DatagramSocket可以指定在哪个端口接受数据

```java
//发送端
//1.创建一个DatagramSocket.准备在9999接受数据
DatagramSocket socket = new DatagramSocket(9999);

//2.构建一个DatagramPacket对象
byte[] buf = new byte[1024];
//UDP协议最大64k
DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);

//3.调用接收方法 将网络传输的DatagramPacket对象
//填充到packet对象
//当有数据包发送到本机的9999端口时,这个方法就会生效 接受数据
//如果没有数据包 本机的9999端口 就会阻塞
System.out.println("接受端A等待接受数据");
socket.receive(datagramPacket);

//4.拆包 取出数据并显示
int length = datagramPacket.getLength();//返回实际的长度
byte[] data =datagramPacket.getData();//实际接受的数据
String s = new String(data, 0, length);
System.out.println(s);

//5.关闭资源
socket.close();



//接受端
//1.创建DatagramSocket,准备发送和接受数据
DatagramSocket datagramSocket = new DatagramSocket(9998);
//准备在9998接受数据

//2.将需要发送的数据封装到DatagramPacket对象中
byte[] bytes = "hello".getBytes();
DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(),9999);
//需要知道IP
datagramSocket.send(datagramPacket);
datagramSocket.close();
System.out.println("b端退出");
```





## 17.反射

### 17.1.OCP原则

通过外部文件配置,在不修改源码的情况下,来控制程序,也符合设计模式的OCP原则(开闭原则,不修改源码,来扩展功能)

###  17.2.反射机制

```java
Properties properties = new Properties();
properties.load(new FileInputStream("src\\Reflection_\\cat.properties"));
String classfullpath = properties.getProperty("classfullpath").toString();
String methodName = properties.getProperty("method").toString();
String methodName1 = properties.getProperty("method1").toString();
System.out.println(classfullpath);
System.out.println(methodName);
System.out.println(methodName1);


//反射机制的解决
//1.加载类,返回Class类型的对象cls
Class cls = Class.forName(classfullpath);
//2.通过cls得到你加载的类 src.Cat 的对象实例 相当于 new Cat()
Object o = cls.newInstance();
System.out.println("o的运行类型="+o.getClass());
//3.通过cls得到吗加载类的src.Cat 的methodName 的方法对象
//既在反射中,可以把方法视为对象
Method method = cls.getMethod(methodName);
//4.通过method调用方法:既通过方法来实现调用方法
method.invoke(o);
```

1. 反射机制允许程序在执行期借助于ReflectionAPI取得任何类的内部信息,并能操作对象的属性及方法,反射在设计模式和框架底层都会用到

2. 加载完类之后,在堆中就产生了一个Class类型的对象(一个类只有一个Class对象),这个对象包含了类的完整结构信息,通过这个对象,得到类的结构,这个Class对象就像一面镜子,透过这个镜子看的类的结构,所以,形象的称之为:反射

   <a href="https://smms.app/image/lJD5GE7CO3mtUKX" target="_blank"><img src="https://s2.loli.net/2024/01/12/lJD5GE7CO3mtUKX.png" ></a>
   
   **在方法区会生成一个类的字节码的二进制数据,方法区会引用Class类对象**

- Java反射机制

  1. 在运行时判断任意一个对象所属的类
  2. 在运行时构造任意一个类的对象
  3. 在运行时得到任意一个类所具有的成员变量和方法
  4. 在运行时调用任意一个对象的成员变量和方法
  5. 生成动态代理

- 反射相关的主要类

  1. java.lang.Class:代表一个类,Class对象表示某个类加载后在堆中的对象

  2. java.lang.reflect.Method:代表类的方法 Method对象表示表示某个类的方法

  3. java.lang.reflect.Field:代表类的成员变量 Field对象表示某个类的成员变量

  4. java.lang.reflect.Constructor:代表类的构造方法 Constructor对象表示

     ```java
     //Filed对象表示某个类的成员变量
     //getFiled不能得到私有属性
     Field nameField = cls.getField("age");
     System.out.println(nameField.get(o));
     //10
     
     //Constructor对象表示构造器
     Constructor constructor = cls.getConstructor();
     System.out.println(constructor);
     //public Cat()
     //()中可以指定构造器参数类型
     //默认返回无参构造器
     
     Constructor constructor2 = cls.getConstructor(String.class,int.class);
     //这里传入的String.class 就是String类的对象Class对象
     System.out.println(constructor2);//Cat(String name,int age)
     //public Cat(java.lang.String,int)
     ```

- 反射优点和缺点

  1. 优点:可以动态的创建和使用对象(也是框架底层核心),使用灵活,没有反射机制,框架技术就失去底层支撑.
  2. 缺点:使用反射基本是解释执行,对执行速度有影响.

- 反射调用优化-关闭访问检查

  1. Method和Field,Constructor对象都有setAccessible()方法

  2. setAccessible作用是启动和禁用访问安全检查的开关

  3. 参数值为true表示,反射的对象在使用时取消访问检查,提高反射的效率,参数值为false则表示反射的对象执行访问检查 

     ```java
     Method hi = cls.getMethod("hi");
     long start = System.currentTimeMillis();
     for (int i = 0; i < 1000000000; i++) {
       hi.invoke(o);
     }
     long end = System.currentTimeMillis();
     System.out.println(end - start);//853
     
     //关闭访问检查
     Method hi = cls.getMethod("hi");
     hi.setAccessible(true);
     long start = System.currentTimeMillis();
     for (int i = 0; i < 1000000000; i++) {
       hi.invoke(o);
     }
     long end = System.currentTimeMillis();
     System.out.println(end - start);//531
     ```



### 17.3.Class类

- 基本介绍

  1. **Class也是类,因此也继承Object类**

  2. **Class类对象不是new出来,而是系统创建的**

     ```java
     public Class<?> loadClass(String name) throws ClassNotFoundException {
       return loadClass(name, false);
     }
     //进行类的加载
     //new Cat() 和 Class cls =Class.forName("src.Cat");
     //这俩个都是进行类的加载
     ```

  3. 对于某个类的Class类对象,在**内存中只有一份,因此类只加载一次**

     ```java
     Cat cat = new Cat();
     Class cls =Class.forName("Cat");
     Class cls1 =Class.forName("Cat");
     System.out.println(cat.hashCode());//1956725890
     System.out.println(cls.hashCode());//1163157884
     System.out.println(cls1.hashCode());//1163157884
     ```

  4. **每个类的实例都会记得自己是由哪个Class实例产生的**

  5. 通过Class可以完整地得到一个类的完整结构,通过一系列的API

  6. **Class对象是存放在堆的**

  7. **类的字节码二进制数据,是放在方法区的,有的地方称为类的元数据(包括 方法代码,变量名,方法名,访问权限等等 )**

- Class类的常用方法

  | **方法名**                                       | **功能说明**                                                 |
  | ------------------------------------------------ | ------------------------------------------------------------ |
  | **static Class forName(String name)**            | **返回指定类名name的class对象**                              |
  | **Object newInstance()**                         | **调用缺省构造器,返回Class对象的一个实例**                   |
  | getName()                                        | 返回此Class对象所表示的实体(类,接口,数组类,基本数据类型等)名称 |
  | Class getSuperClass()                            | 返回当前Class对象的父类的Class对象                           |
  | Class[] getInterfaces()                          | 获取当前Class对象的接口                                      |
  | ClassLoader getClassLoader()                     | 返回该类的类加载器                                           |
  | Class getSuperclass()                            | 返回表示此Class所表示的实体的超类的Class                     |
  | Constructor[] getConstructors()                  | 返回一个包含某些Constructor对象的数组                        |
  | Field[] getDeclaredFields()                      | 返回Field对象的一个数组                                      |
  | Method getMethod(String name,Class … paramTypes) | 返回一个Method对象，此对象的形参类型为paramType              |

  ```java
  //Class类的方法使用
  
  String classAllPath = "Car";
  //1.获取car类对应的class对象
  Class<?> cls = Class.forName(classAllPath);
  System.out.println(cls);//class Car
  
  //2.显示cls对象,是哪个类运行的Class对象 Car
  System.out.println(cls.getClass());
  //class java.lang.Class 运行类型
  
  //3.得到包名
  System.out.println(cls.getPackage().getName());
  
  //4.得到类名
  System.out.println(cls.getName());//Car
  
  //5.通过cls创建对象实例
  Car car = (Car) cls.newInstance();
  System.out.println(car);//Car{brand='BWM', price=5000000, color='BLACK'}
  
  //6.通过反射获取属性brand
  Field brand = cls.getField("brand");
  Object o = brand.get(car);
  System.out.println(o);//BWM
  
  //7.通过反射给属性赋值
  brand.set(car, "奔驰");
  System.out.println(brand.get(car));//奔驰
  
  //8.获取所有的字段属性
  Field[] fields = cls.getFields();
  for (Field f: fields
      ) {
    System.out.println(f.getName());
  }
  //brand
  //price
  //color
  ```
  
- 获取Class对象

  1. 前提:已知一个类的全类名,且该类在类路径下,可通过Class类的静态方法forName()获取,可能抛出ClassNotFoundException

     `Class cls1 = Class.forName("java.lang.Cat");`

     应用场景:**多用于配置文件,读取类全路径,加载类**

  2. 前提:若已知具体的类,通过类的class获取,该方式 最为完全可靠,程序性能最高实例:`Class cls2 = Cat.class;`

     应用场景:**多用于参数传递,比如通过反射得到对应构造器对象**

     ```java
     //1.获取car类对应的class对象
     String classAllPath = "Car";
     Class<?> cls = Class.forName(classAllPath);
     System.out.println(cls);
     //class Car
     
     //2.类名.class 应用场景:用于参数传递
     Class cls2 =Car.class;
     System.out.println(cls2);
     //class Car
     
     //3.对象.getClass() 应用场景,有对象实例
     Car car = new Car();
     Class cls3 = car.getClass();
     System.out.println(cls3);
     //class Car
     
     //4.通过类加载器来获取类的Class对象
     //4.1先得到类加载器Car
     ClassLoader classLoader = car.getClass().getClassLoader();
     //4.2通过类加载器得到Class对象
     Class cls4 = classLoader.loadClass("Car");
     System.out.println(cls4);
     //class Car
     
     //5.基本数据类型 也能得到相应的Class类对象
     Class<Integer> integerClass = int.class;
     Class<Boolean> booleanClass = boolean.class;
     System.out.println(integerClass);//int
     System.out.println(booleanClass);//boolean
     
     //6.基本数据类型对应的包装类 可以通过 .TYPE 得到Class类对象
     Class<Integer> type = Integer.TYPE;
     Class<Boolean> type1 = Boolean.TYPE;
     System.out.println(type);//int
     System.out.println(type1);//boolean
     
     
     Class<Integer> integerClass = int.class;//基本数据类型
     Class<Integer> integerClass1 = Integer.class;
     Class<Integer> type = Integer.TYPE;
     System.out.println(integerClass1.hashCode());//1163157884
     System.out.println(integerClass.hashCode());//1956725890
     System.out.println(type.hashCode());//1956725890
     ```
     
     **在底层中,Integer.TYPE和int的class对象都是同一个对象, 它们的hashcode都是同一个对象**
     
     > Integer 是 Object Type 对象类型，int 是 Primitive Type 原始类型
     > Integer 有成员变量，有成员方法，int 无成员变量，无成员方法
     > Integer.class 与 int.class 不同；Integer.TYPE 与 int.class 相同

- 有Class对象的类型

  1. 外部类,成员内部类,静态内部类,局部内部类,匿名内部类

  2. interface接口

  3. 数组

  4. enum枚举

  5. annotation注解

  6. 基本数据类型

  7. void

     ```java
     Class<String> stringClass = String.class;//外部类
     Class<Serializable> serializableClass = Serializable.class;//接口
     Class<Integer[]> aClass = Integer[].class;//数组
     Class<float[][]> aClass1 = float[][].class;//二维数组
     Class<Deprecated> deprecatedClass = Deprecated.class;//注解
     Class<Thread.State> stateClass = Thread.State.class;//State也是枚举
     Class<Integer> integerClass = int.class;//基本数据类型
     Class<Void> voidClass = void.class;//void数据类型
     Class<Class> classClass = Class.class;//Class也是类
     ```





### 17.4.类加载

- 基本说明

  反射机制是java实现动态语言的关键,也就是通过反射实现类动态加载

  1. 静态加载:编译时加载相关的类,如果没有则报错,依赖性太强
  2. 动态加载:运行加载需要的类,如果运行时不用该类,则不报错,降低了依赖性

- 类的加载时机

  1. 当创建对象时(new)(静态加载)
  2. 当子类被加载时(静态加载)
  3. 调用类中的静态成员时(静态加载)
  4. 通过反射 (动态加载)

- 类加载的五个过程

  - 加载阶段
  
    JVM在该阶段的主要目的是将字节码从不同的数据源(可能是class文件,也可能是jar包,甚至网络)转换为二进制字节流加载到内存中,并生成一个代表该类的java.lang.Class对象
  
  - 连接阶段-验证
  
    1. 目的是为了确保Class文件的字节流中包含的信息符号当前虚拟机的要求,并且不会危害虚拟机自身的安全.
  
    2. 包括:**文件格式验证(是否以魔数 0x cafe babe开头),元数据的验证,字节码验证和符号引用验证(说明他是合法的class文件)**
  
    3. 可以考虑使用 -Xverify:nore 参数来关闭大部分的类验证措施,缩短虚拟机类加载的时间
  
       ```java
       public Class<?> loadClass(String var1, boolean var2) throws ClassNotFoundException {
         int var3 = var1.lastIndexOf(46);
         if (var3 != -1) {
           SecurityManager var4 = System.getSecurityManager();
           //SecurityManager安全验证
           //文件格式验证(是否以魔数oxcafebabe开头),元数据的验证,字节码验证和符号引用验证
           if (var4 != null) {
             var4.checkPackageAccess(var1.substring(0, var3));
           }
         }
       ```
  
  - 连接阶段-准备
  
    JVM会在该阶段**对静态变量(跟非静态变量没有关系),**分配内存并默认初始化(对应数据类型的默认初始化值,如0,0L,null,false等),这些变量所以使用的内存都将在方法区中进行分配(不管给什么值,先进行默认初始化)
  
    ```java
    class A{
      //属性 =  成员变量 = 字段
      //链接阶段-准备 属性是如何处理的
      private int n1 = 10;
      //n1是实例变量 不是静态变量 在准备阶段不会分配内存
      private static int age = 10;
      //n2是静态变量 分配内存 n2默认初始化为0 在初始化阶段才会真正为10
      private static final int n3 = 20;
      //n3是static final类型 他和静态变量不一样,一旦赋值就不变了 在准备阶段 n3就直接赋值为30
    }
    ```
  
  - 连接阶段-解析
  
    虚拟机将常量池内的符号引用替换为直接引用的过程
  
  - 初始化(Inititalization)
  
    1. 初始化阶段,才是真正开始执行类中定义的java程序代码,此阶段是执行<clinit\>()方法的过程
    
    2. <clinit\>方法是由编译器按语句在源文件中出现的顺序,依次自动收集类中所有的静态变量的赋值动作和静态代码块中的语句,按照顺序进行合并
    
    3. 虚拟机会保证一个类的<clinit\>()方法在多线程环境中正确地加锁,同步,如果多个线程同时去初始化一个类,那么只会有一个线程去执行这个类的<clinit\>方法,其他线程都需要阻塞等待,直到活动线程执行<clinit\>()方法完毕    
    
       ```java
       protected Class<?> loadClass(String name, boolean resolve)
         throws ClassNotFoundException
       {	//下面这个机制,才能保证某个类在内存中,只有一份class对象
         synchronized (getClassLoadingLock(name)) {
         }
       }
       ```





### 17.5.通过反射获取类的结构信息

- java.lang.Class类

  ```java
  //先得到class对象
  Class<?> personClass = Class.forName("Reflection_.Person");
  //getName得到全类名
  System.out.println(personClass.getName());//Reflection_.Person
  //getSimpleName获取简单类名
  System.out.println(personClass.getSimpleName());//Person
  //getFields获取所有public修饰的属性,包含本类以及父类的
  Field[] fields = personClass.getFields();
  for (Field field : fields) {
    System.out.println(field.getName());
    //name
    //superName
  }
  //getDeclareFields获取本类所有属性
  Field[] declaredFields = personClass.getDeclaredFields();
  for (Field declaredField : declaredFields) {
    System.out.println(declaredField.getName());
    //name
    //age
    //job
    //sal
  }
  System.out.println();
  //getMethods获取所有public修饰的方法 包括本类及父类的方法
  Method[] methods = personClass.getMethods();
  for (Method method : methods) {
    System.out.println(method.getName());
  }
  //m1//superMethod//wait//wait//wait//equals//toString//hashCode//getClass//notify//notifyAll
  System.out.println();
  ```

- java.lang.reflect.Field类

  1. getModifiers:以int形式返回修饰符

     (默认修饰符是0,public是1,private是2,protected是4,static是8,final是16)

     public + static = 1 + 8 = 9

  2. getType:以class形式返回类型

  3. getName:返回属性名



### 17.6.通过反射创建对象

1. 调用类中的public修饰的无参构造器

2. 调用类中的指定的构造器

3. Class类相关的方法

   1. newInstance:调用类 中的无参构造器,获取对应的对象
   2. getConstructor(Class…clazz)根据参数列表获取对应的构造器对象
   3. getDecalaredConstructor(Class…clazz)根据参数列表,获取对应的构造器对象

4. Constructor类相关方法

   1. setAccessible:爆破
   2. newIntstance(Object…obj):调用构造器

   ```java
   import java.lang.reflect.Constructor;
   import java.lang.reflect.InvocationTargetException;
   
   public class ReflectCreatInstance {
     public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
   
       //1.先获取User的class对象
       Class<?> useraClass = Class.forName("User");
   
       //2.通过public的无参构造器创建实例
       Object o = useraClass.newInstance();
       System.out.println(o); //age =10  name =dick
   
       //3.通过public的有参构造器创建实例
       //先得到对应的构造器 再去创建实例 并传入实参
       Constructor<?> constructor = useraClass.getConstructor(String.class);
       //这个Constructor对象代表public User(String name){...}
       Object o1 = constructor.newInstance("tom");
       System.out.println(o1);//age =10  name =tom
   
       //4.通过非public的有参构造器创建实例
       Constructor<?> constructor1 = useraClass.getDeclaredConstructor(int.class, String.class);
       //getDeclaredConstructor获取所有的构造器 包括私有的
       constructor1.setAccessible(true);//进行暴破 使用反射可以访问私有的构造器
       //先进行暴破 再创建实例
       Object user2 = constructor1.newInstance(100, "dicker");
       System.out.println(user2);
   
   
   
   
     }
   }
   class User{
     private int age = 10;
     private String name = "dick";
     public User(){
       //无参构造器
     }
     public User(String name){//public有参构造器
       this.name = name;
     }
     private User(int age, String name){//private有参构造器
       this.name = name;
       this.age = age;
   
     }
     public String toString(){
       return  "age ="+age+"  name ="+name;
     }
   }
   ```





### 17.7.通过反射访问类中的成员

1. 根据属性名获取Field对象

   `Field f = class对象.getDeclareField(属性名);`

2. 暴破:`f.setAccessible(true);//f 是field`

3. 访问:`f.set(o,值);//o表示对象`  `syso(f.get(o));//o表示对象`

4. **如果是静态属性,则 set和get中的参数o,可以写成null**

```java
//访问属性
Class<?> aClass = Class.forName("Cat");
//创建对象
Object o2 = aClass.newInstance();
System.out.println(o2.getClass());//class Cat
//使用反射得到age 属性对象
Field age = aClass.getField("age");
age.set(o2, 23);//通过反射来操作值
System.out.println(o2);//Cat{name='TOM', age=23}
//使用反射操作name
Field declaredField = aClass.getDeclaredField("name");
declaredField.setAccessible(true);//进行暴破
declaredField.set(o2, "dicker");//Cat{name='dicker', age=23}
declaredField.set(null, "dasd");//Cat{name='dasd', age=23}
//得到对象
System.out.println(o2);

//必须为静态 否则不能使用
System.out.println(declaredField.get(o2));//dasd
```

- 访问方法

  1. 根据方法名和参数列表获取Method方法对象

     `Method m = class.getDeclaredMethod(方法名,XX.class);//得到本类的所有方法`

  2. 获取对象:`Object o = class.newInstance();`

  3. 暴破:`m.setAccessible(true);`

  4. 访问:`Object returnValue = m.invoke(o,实参列表);`

  5. 如果是静态方法,则invoke的参数o,可以写成null

  ```java
  //得到class对象
  Class<?> aClass = Class.forName("Cat");
  //创建对象
  Object o2 = aClass.newInstance();
  //调用public方法
  //Method hi = aClass.getMethod("hi");
  Method hi = aClass.getDeclaredMethod("hi");
  //调用方法
  Object asd = hi.invoke(o2);
  System.out.println(asd);//hi null
  
  Method cry = aClass.getDeclaredMethod("cry");
  //因为cry方法是私有的 需要爆破才能调用
  cry.setAccessible(true);
  Object invoke = cry.invoke(o2);
  System.out.println(invoke);//~~~ null
  System.out.println(cry.invoke(null, null));
  //cry为静态属性 所以直接用null也行
  //~~~   null
  //在反射中 如果有返回值 统一返回Object
  //编译类型以Object接受
  ```



[^1-14-2024]:ending….



