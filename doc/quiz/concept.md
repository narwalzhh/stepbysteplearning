## 基本概念测试

### 写在前面
1. 一次测试分两天进行，即第一天通知需要做测试，第二天提交答案和代码，进行评审（如：周一通知需要做测试，周二提交代码，周二晚上做评审）
2. 提交内容可能会超前，超前的部分不用做，但是可以事先了解。通知时，会具体通知需要做第几次测试

### Day 1
#### 如何理解面向对象这个概念（个人理解，简单回答）
> The answer goes here
> ```
>面向对象与面向过程相比，能够将一个问题的处理模块化，对象就像电路里的不同部件，程序就像是导线，将对象按照正确的顺序组织在一起，实现整个电路的功能，将具有不同功能的模块组织在一起，实现程序解决问题的目的，而不是一个程序只能处理一个问题，面向对象更加高效，逻辑更加清晰，分工更加明确，更加安全
> ```

#### 你认为如何把自己的程序写的具有健壮性
> The answer goes here
>```
>之前没听过这个概念，吓得我去百度了一下。抛开自己脑海里预设的程序执行流程，因为自己的思路是按照正确的操作顺序进行的，但实际用户操作可能会有各种各样的失误，要将用户的错误操作可能性考虑进去并设置对应的解决方案，注意检查参数的合法性，先测试后优化（百度说的）
>```

### Day 2
#### 简述 Windows 版本 JDK 安装过程（包括如何配置环境变量等）
> The answer goes here
>```
>下载安装最新版本JDK
>配置环境变量 计算机->属性->高级系统设置->环境变量
>1.创建系统环境变量，变量名为"JAVA_HOME"，变量值为JDK安装目标文件夹
>2.修改原有系统环境变量"path"，将"%JAVA_HOME%/bin;"添加至原有变量值最前方
>3.运行cmd键入"java -version"检查是否正确安装
>```

#### 如何借助命令行（cmd）查看 JDK 已经正确安装
> The answer goes here
>```
>键入 java -version 或 JAVAC
>```

#### 如何查看当前默认 JDK 版本
> The answer goes here
>```
>利用cmd命令查看
>```

#### 如何修改 IDE（集成开发环境）默认编码和换行符（简述）
> The answer goes here
>```
>打开eclipse
>修改默认编码，Windows->preferences->workspace->text file encoding->other->UTF-8
>修改换行符，Windows->preferences->workspace->new text file line delimiter->other->unix
>```

#### 如何使用 IDE 引入一个已经存在的 Java 工程（简述）
> The answer goes here
>```
>打开eclipse，在package explorer面板中右击，选择import->existing projects into workspace,选取工程路径后导入
>```

#### 简单解释以下 Linux 命令
> The answer goes here
>```
> 1. cd: 切换文件夹
> 2. ls: 显示文件夹或目录
> 3. ll: 列出文件详细信息
> 4. .: 当前目录
> 5. ..: 上一级目录
> 6. cat: 显示文件信息
>```

#### 安装 git 后，如何指定全局的用户名（user.name）和邮箱（user.email）
> The answer goes here
>```
>git confing --global user.name"NAME"
>git confing --global user.email"ADDRESS"
>```

#### 如何生成 git 所需的 ssh key
> The answer goes here
>```
>ssh-keygen -t rsa -C"email@example.com"
>```

#### 如何使用 git 创建初始化一个本地的仓库
> The answer goes here
>```
>进入目标文件夹后使用命令
>git init
>```

#### 如何使用 git 将本地文件增加到暂存区，并提交到本地仓库
> The answer goes here
>```
>git add test.txt
>git commit -m"describtion"
>```

#### 如何查看当前 git 仓库的状态
> The answer goes here
>```
>git status
>```

#### 如何查看某个增加到暂存区文件的文件修改了哪些内容
> The answer goes here
>```
>git diff test.txt
>```

#### 如何拉取远程仓库的更新到本地并与本地代码合并
> The answer goes here
> ```
>git pull origin master
> ```

#### 如何将本地仓库中新的提交推送到远程
> The answer goes here
> ```
>git push origin master
> ```

### Day 3
#### 如何使用 Linux 命令创建一个文件夹
> The answer goes here
>```
>mkdir learngit
>```

#### Linux 下如何查看当前路径
> The answer goes here
>```
>pwd
>```

#### 如何查看代码提交历史
> The answer goes here
>```
>git log
>git reflog
>```

#### Java 基本数据类型占用字节大小
> The answer goes here
>```
> 1. int: 4
> 2. short: 2 
> 3. long: 8
> 4. byte: 1
> 5. float: 4
> 6. double: 8
>```

#### 请简单解释 Java 中运算符 ^
> The answer goes here
>```
>明白了，按位亦或。A^B,AB均为二进制，对齐比较二者，同一位相同为0，不同为1
>```
#### 请自行搜索 Java 中求立方根的函数
> The answer goes here
>```
>public static double pow(double a, double b)
>```

#### 请写出 8、10、 15、127、258、339 的二进制表示法，并计算 8 ^ 10 的值
> The answer goes here
>```
> 1. 8: 1000
> 2. 10: 1010
> 3. 15: 1111
> 4. 127: 1111111
> 5. 258: 100000010
> 6. 339: 100000011
> 7. 8 ^ 10: 0010
>```

#### 请说明 'A' 与 "A" 是否标识相同的含义，如果不是，则解释为什么
> The answer goes here
>```
>'A'为字符，是基本类型。"A"为字符串类，不是基本类型
>```

#### char 类型的 'A', 'a', 'Z', 'z' 字符常量对应的 10 进制数字分别是多少
> The answer goes here
>```
> 1. 'A': 65
> 2. 'a': 97
> 3. 'Z': 90
> 4. 'z': 122
>```

#### 请使用转义字符修改下面代码中的错误
> The answer goes here
>```
> String str = "{\"id\" : \"ID00001\", \"code\" : \"liuyb\", \"name\" : \"liuyabo\"}";
> String str = "C:\\file\\doc\\a.txt";
>```

#### 请指出下列变量命名的错误之处
> The answer goes here
>```
> 1. int 1i = 10; ----> 变量名首位不可为数字
> 2. String default = "what's your super power again ? answer: I'm rich !!!"; ----> 变量名不可为保留字
> 3. long number_ = 10000000L; ----> 变量名首字母应大写
>```

#### java 中，指示常量的关键字是什么，并简单解释此关键字的作用
> The answer goes here
>```
>final
>使用时表示无法改变的，可以用于修饰变量，变量值为常量不能再次被修改
>用于修饰方法，则该方法可以被子类继承，但不能被覆盖
>用于修饰类时，表示该类不能再被继承，且该类中的方法均为final方法
>```

#### 请写出 x = x + 5, y = y * 8 的简单书写方式
> The answer goes here
>```
>x += 5
>y *= 8
>```

#### 请计算下列变量的值
> The answer goes here
>```
> int i = 7;
> int j = 8;
> int a = 1 + ++i;
> int b = 4 * j++;
> a:  9
> a 的运算方式：i自增1后，再与1相加
> b:  32
> b 的运算方式： 4乘以j后，j再自增1
>```

##### 请简述 &&, ||, &, | 的运算规则
> The answer goes here
>```
> 1. if (expression1 && expression2)  &的短路运算，若左为假，不计算右边，表达式为假
> 2. if (expression1 || expression2)  |的短路运算，若左为真，不计算右边，表达式为真
> 3. if (expression1 & expression2)   左右均为真，表达式为真
> 4. if(expression1 | expression2)    左右只需有一个为真，表达式为真，左右均为假，表达式为假
>```

#### 请计算下列数字位运算符后的结果，并用二进制表示
> The answer goes here
>```
> 运算式       十进制     二进制
> 10            
> 10 << 1       20        10100
> 10 << 2       40       101000
> 10 >> 1       5          0101
>```

#### 请写出下列表达式的值并解释
> The answer goes here
>```
> String string = "I'm using java!" 
> string.substring(0, 5): "I'm u"  substring（a , b）取子字符串，自a位开始，b位结束，包含a，不包含b
> string.substring(9):  "java！"   substring(c)取子字符串，自a位开始至字符串结束
>```

#### 请运行下列代码，并解释现象
> The answer goes here
>```
>   String a = "a";
>       if (a.length() == 1) {
>           a = null;
>       }
>   System.out.println(a.equals("abc"));
> 
>   String a = "a";
>       if (a.length() == 1) {
>           a = null;
>       }
>   System.out.println("abc".equals(a));
>
> 解释：equals()方法在String中重写，用于比较调用对象引用与方法参数引用所指向字符串内容是否相同。a为String类的引用，前者将a指向null后，a表示不确定的对象，因此a不再包含equals()方法，因此运行程序报错。后者"abc"为字符串对象，包含equals()方法，比较"abc"与null指向内容后发现不同，因此返回false
>```

##### 请自行搜索 switch case 语句的穿透现象，并作简单解释
> The answer goes here
>```
>switch语句在执行时，会首先找到匹配的case处，自该case处开始执行，直至break或switch语句结束的右大括号处，忽略中间出现的其他case值，这种情况称为穿透现象。
>```

#### 请使用两种 for 循环方式，取出数组中的每一个元素
> The answer goes here
>```
> String[] str = {"烤", "鸡", "翅", "膀", "啊", "，", "我", "最", "爱", "吃", "！"};
>```

#### 请将数组转化成 List
> The answer goes here
>```
> String[] str = {"烤", "鸡", "翅", "膀", "啊", "，", "我", "最", "爱", "吃", "！"};
> ArrayList<Element> arrayList = new ArrayList<Element>(Arrays.asList(str));
>```

