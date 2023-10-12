# Итоговая контрольная работа
## Информация о проекте
Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.
## Как сдавать проект
Для сдачи проекта необходимо создать отдельный общедоступный
репозиторий(Github, gitlub, или Bitbucket). Разработку вести в этом
репозитории, использовать пул реквесты на изменения. Программа должна
запускаться и работать, ошибок при выполнении программы быть не должно.
Программа, может использоваться в различных системах, поэтому необходимо
разработать класс в виде конструктора

## Задания:
### Задание 1
Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).
```
rooney@rooney-ubuntu:~/work2$ cat>домашниеживотные.txt

собаки 

кошки 

хомяки

rooney@rooney-ubuntu:~/work2$ cat>вьючныеживотные.txt

лошади

верблюды

ослы

слоны

rooney@rooney-ubuntu:~/work2$ cat домашниеживотные.txt вьючныеживотные.txt > друзьячеловека.txt

rooney@rooney-ubuntu:~/work2$ ll

итого 20

drwxrwxr-x  2 rooney rooney 4096 окт  5 17:35 ./

drwxr-x--- 17 rooney rooney 4096 окт  5 17:22 ../

-rw-rw-r--  1 rooney rooney   50 окт  5 17:35 вьючныеживотные.txt

-rw-rw-r--  1 rooney rooney   37 окт  5 17:34 домашниеживотные.txt

-rw-rw-r--  1 rooney rooney   87 окт  5 17:35 друзьячеловека.txt

rooney@rooney-ubuntu:~/work2$ cat друзьячеловека.txt

собаки

кошки

хомяки

лошади

верблюды

ослы

слоны

rooney@rooney-ubuntu:~/work2$ mv друзьячеловека.txt друзья_человека.txt

rooney@rooney-ubuntu:~/work2$ ll

итого 20

drwxrwxr-x  2 rooney rooney 4096 окт  5 17:38 ./

drwxr-x--- 17 rooney rooney 4096 окт  5 17:22 ../

-rw-rw-r--  1 rooney rooney   50 окт  5 17:35 вьючныеживотные.txt

-rw-rw-r--  1 rooney rooney   37 окт  5 17:34 домашниеживотные.txt

-rw-rw-r--  1 rooney rooney   87 окт  5 17:35 друзья_человека.txt
```
### Задание 2
Создать директорию, переместить файл туда.

```
rooney@rooney-ubuntu:~/work2$ mkdir result

rooney@rooney-ubuntu:~/work2$ mv друзья_человека.txt result

rooney@rooney-ubuntu:~/work2$ ll

итого 20

drwxrwxr-x  3 rooney rooney 4096 окт  5 17:41 ./

drwxr-x--- 17 rooney rooney 4096 окт  5 17:22 ../

drwxrwxr-x  2 rooney rooney 4096 окт  5 17:41 result/

-rw-rw-r--  1 rooney rooney   50 окт  5 17:35 вьючныеживотные.txt

-rw-rw-r--  1 rooney rooney   37 окт  5 17:34 домашниеживотные.txt

rooney@rooney-ubuntu:~/work2$ ll result

итого 12

drwxrwxr-x 2 rooney rooney 4096 окт  5 17:41 ./

drwxrwxr-x 3 rooney rooney 4096 окт  5 17:41 ../

-rw-rw-r-- 1 rooney rooney   87 окт  5 17:35 друзья_человека.txt

rooney@rooney-ubuntu:~/work2$
```
### Задание 3
Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.
```
rooney@rooney-ubuntu:~/work2$ sudo dpkg -i /home/rooney/Загрузки/mysql-apt-config_0.8.26-1_all.deb

[sudo] пароль для rooney: 

Выбор ранее не выбранного пакета mysql-apt-config.

(Чтение базы данных … на данный момент установлено 186936 файлов и каталогов.)

Подготовка к распаковке …/mysql-apt-config_0.8.26-1_all.deb …

Распаковывается mysql-apt-config (0.8.26-1) …

Настраивается пакет mysql-apt-config (0.8.26-1) …

rooney@rooney-ubuntu:~/work2$ sudo dpkg -i /home/rooney/Загрузки/mysql-apt-config_0.8.26-1_all.deb

(Чтение базы данных … на данный момент установлен 186941 файл и каталог.)

Подготовка к распаковке …/mysql-apt-config_0.8.26-1_all.deb …

Распаковывается mysql-apt-config (0.8.26-1) на замену (0.8.26-1) …

Настраивается пакет mysql-apt-config (0.8.26-1) …

rooney@rooney-ubuntu:~/work2$ sudo dpkg -i /home/rooney/Загрузки/mysql-apt-config_0.8.26-1_all.deb

(Чтение базы данных … на данный момент установлен 186941 файл и каталог.)

Подготовка к распаковке …/mysql-apt-config_0.8.26-1_all.deb …

Распаковывается mysql-apt-config (0.8.26-1) на замену (0.8.26-1) …

Настраивается пакет mysql-apt-config (0.8.26-1) …

rooney@rooney-ubuntu:~/work2$ sudo apt-get update

Пол:1 http://repo.mysql.com/apt/ubuntu jammy InRelease [20,3 kB]

Сущ:2 http://ru.archive.ubuntu.com/ubuntu jammy InRelease                                                              

Пол:3 http://ru.archive.ubuntu.com/ubuntu jammy-updates InRelease [119 kB]                                             

Пол:4 http://security.ubuntu.com/ubuntu jammy-security InRelease [110 kB]                                              

Пол:5 http://ru.archive.ubuntu.com/ubuntu jammy-backports InRelease [109 kB]                                           

Сущ:6 https://download.docker.com/linux/ubuntu jammy InRelease                                      

Пол:7 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 Sources [963 B]

Пол:8 http://repo.mysql.com/apt/ubuntu jammy/mysql-apt-config amd64 Packages [565 B]

Пол:9 http://repo.mysql.com/apt/ubuntu jammy/mysql-apt-config i386 Packages [565 B]

Пол:10 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 Packages [12,7 kB]

Пол:11 http://repo.mysql.com/apt/ubuntu jammy/mysql-tools i386 Packages [457 B]

Пол:12 http://repo.mysql.com/apt/ubuntu jammy/mysql-tools amd64 Packages [8 011 B]

Пол:13 http://security.ubuntu.com/ubuntu jammy-security/main amd64 Packages [856 kB]

Пол:14 http://security.ubuntu.com/ubuntu jammy-security/main i386 Packages [345 kB]

Пол:15 http://security.ubuntu.com/ubuntu jammy-security/main Translation-en [175 kB]

Пол:16 http://security.ubuntu.com/ubuntu jammy-security/main amd64 DEP-11 Metadata [43,1 kB]

Пол:17 http://security.ubuntu.com/ubuntu jammy-security/main amd64 c-n-f Metadata [11,4 kB]

Пол:18 http://security.ubuntu.com/ubuntu jammy-security/restricted amd64 Packages [953 kB]

Пол:19 http://security.ubuntu.com/ubuntu jammy-security/restricted i386 Packages [32,0 kB]

Пол:20 http://security.ubuntu.com/ubuntu jammy-security/restricted Translation-en [154 kB]

Пол:21 http://security.ubuntu.com/ubuntu jammy-security/restricted amd64 c-n-f Metadata [532 B]

Пол:22 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 Packages [788 kB]

Пол:23 http://security.ubuntu.com/ubuntu jammy-security/universe i386 Packages [560 kB]

Пол:24 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main i386 Packages [503 kB]                    

Пол:25 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 Packages [1 058 kB]                 

Пол:26 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main Translation-en [233 kB]         

Пол:27 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 DEP-11 Metadata [101 kB]       

Пол:28 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 c-n-f Metadata [15,6 kB]        

Пол:29 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted i386 Packages [32,3 kB]        

Пол:30 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 Packages [974 kB]        

Пол:31 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted Translation-en [157 kB]        

Пол:32 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 c-n-f Metadata [532 B]  

Пол:33 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 Packages [989 kB]       

Пол:34 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe i386 Packages [658 kB]          

Пол:35 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe Translation-en [216 kB]         

Пол:36 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 DEP-11 Metadata [291 kB]  

Пол:37 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe DEP-11 48x48 Icons [204 kB]      

Пол:38 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe DEP-11 64x64 Icons [311 kB]     

Пол:39 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 c-n-f Metadata [21,9 kB]  

Пол:40 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 Packages [41,6 kB]       

Пол:41 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 DEP-11 Metadata [940 B] 

Пол:42 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 c-n-f Metadata [472 B]  

Пол:43 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main amd64 Packages [41,7 kB]                

Пол:44 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main i386 Packages [33,9 kB]                 

Пол:45 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main amd64 DEP-11 Metadata [4 948 B]         

Пол:46 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main DEP-11 48x48 Icons [16,1 kB]                   

Пол:47 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main DEP-11 64x64 Icons [21,3 kB]            

Пол:48 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main amd64 c-n-f Metadata [388 B]            

Пол:49 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 Packages [24,3 kB]            

Пол:50 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe i386 Packages [13,4 kB]          

Пол:51 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 DEP-11 Metadata [17,8 kB]

Пол:52 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe DEP-11 48x48 Icons [15,7 kB]     

Пол:53 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe DEP-11 64x64 Icons [25,6 kB]  

Пол:54 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 c-n-f Metadata [640 B]  

Пол:55 http://security.ubuntu.com/ubuntu jammy-security/universe Translation-en [144 kB]          

Пол:56 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 DEP-11 Metadata [40,1 kB]

Пол:57 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 c-n-f Metadata [16,7 kB]

Пол:58 http://security.ubuntu.com/ubuntu jammy-security/multiverse amd64 Packages [36,5 kB]

Пол:59 http://security.ubuntu.com/ubuntu jammy-security/multiverse amd64 c-n-f Metadata [260 B]

Получено 10,6 MB за 7с (1 429 kB/s)                                                                                    

Чтение списков пакетов… Готово

rooney@rooney-ubuntu:~/work2$  sudo apt-get install mysql-server

Чтение списков пакетов… Готово

Построение дерева зависимостей… Готово

Чтение информации о состоянии… Готово         

Будут установлены следующие дополнительные пакеты:

  libaio1 libmecab2 mecab-ipadic mecab-ipadic-utf8 mecab-utils mysql-client mysql-common mysql-community-client

  mysql-community-client-core mysql-community-client-plugins mysql-community-server mysql-community-server-core

Следующие НОВЫЕ пакеты будут установлены:

  libaio1 libmecab2 mecab-ipadic mecab-ipadic-utf8 mecab-utils mysql-client mysql-common mysql-community-client

  mysql-community-client-core mysql-community-client-plugins mysql-community-server mysql-community-server-core

  mysql-server

Обновлено 0 пакетов, установлено 13 новых пакетов, для удаления отмечено 0 пакетов, и 31 пакетов не обновлено.

Необходимо скачать 37,7 MB архивов.

После данной операции объём занятого дискового пространства возрастёт на 273 MB.

Хотите продолжить? [Д/н] y

Пол:1 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libaio1 amd64 0.3.112-13build1 [7 176 B]

Пол:2 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-common amd64 8.0.34-1ubuntu22.04 [67,7 kB]

Пол:3 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 libmecab2 amd64 0.996-14build9 [199 kB]

Пол:4 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-client-plugins amd64 8.0.34-1ubuntu22.04 [1 435 kB]

Пол:5 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 mecab-utils amd64 0.996-14build9 [4 850 B]

Пол:6 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 mecab-ipadic all 2.7.0-20070801+main-3 [6 718 kB]

Пол:7 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-client-core amd64 8.0.34-1ubuntu22.04 [2 087 kB]

Пол:8 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-client amd64 8.0.34-1ubuntu22.04 [2 113 kB]

Пол:9 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-client amd64 8.0.34-1ubuntu22.04 [66,4 kB]

Пол:10 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-server-core amd64 8.0.34-1ubuntu22.04 [24,8 MB]

Пол:11 http://ru.archive.ubuntu.com/ubuntu jammy/main amd64 mecab-ipadic-utf8 all 2.7.0-20070801+main-3 [4 384 B]

Пол:12 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-community-server amd64 8.0.34-1ubuntu22.04 [78,2 kB]

Пол:13 http://repo.mysql.com/apt/ubuntu jammy/mysql-8.0 amd64 mysql-server amd64 8.0.34-1ubuntu22.04 [66,4 kB]

Получено 37,7 MB за 4с (8 680 kB/s)        

Предварительная настройка пакетов …

Выбор ранее не выбранного пакета mysql-common.

(Чтение базы данных … на данный момент установлен 186941 файл и каталог.)

Подготовка к распаковке …/00-mysql-common_8.0.34-1ubuntu22.04_amd64.deb …

Распаковывается mysql-common (8.0.34-1ubuntu22.04) …

Выбор ранее не выбранного пакета mysql-community-client-plugins.

Подготовка к распаковке …/01-mysql-community-client-plugins_8.0.34-1ubuntu22.04_amd64.deb …

Распаковывается mysql-community-client-plugins (8.0.34-1ubuntu22.04) …

Выбор ранее не выбранного пакета mysql-community-client-core.

Подготовка к распаковке …/02-mysql-community-client-core_8.0.34-1ubuntu22.04_amd64.deb …

Распаковывается mysql-community-client-core (8.0.34-1ubuntu22.04) …

Выбор ранее не выбранного пакета mysql-community-client.

Подготовка к распаковке …/03-mysql-community-client_8.0.34-1ubuntu22.04_amd64.deb …

Распаковывается mysql-community-client (8.0.34-1ubuntu22.04) …

Выбор ранее не выбранного пакета mysql-client.

Подготовка к распаковке …/04-mysql-client_8.0.34-1ubuntu22.04_amd64.deb …

Распаковывается mysql-client (8.0.34-1ubuntu22.04) …

Выбор ранее не выбранного пакета libaio1:amd64.

Подготовка к распаковке …/05-libaio1_0.3.112-13build1_amd64.deb …

Распаковывается libaio1:amd64 (0.3.112-13build1) …

Выбор ранее не выбранного пакета libmecab2:amd64.

Подготовка к распаковке …/06-libmecab2_0.996-14build9_amd64.deb …

Распаковывается libmecab2:amd64 (0.996-14build9) …

Выбор ранее не выбранного пакета mysql-community-server-core.

Подготовка к распаковке …/07-mysql-community-server-core_8.0.34-1ubuntu22.04_amd64.deb …

Распаковывается mysql-community-server-core (8.0.34-1ubuntu22.04) …

Выбор ранее не выбранного пакета mysql-community-server.

Подготовка к распаковке …/08-mysql-community-server_8.0.34-1ubuntu22.04_amd64.deb …

Распаковывается mysql-community-server (8.0.34-1ubuntu22.04) …

Выбор ранее не выбранного пакета mecab-utils.

Подготовка к распаковке …/09-mecab-utils_0.996-14build9_amd64.deb …

Распаковывается mecab-utils (0.996-14build9) …

Выбор ранее не выбранного пакета mecab-ipadic.

Подготовка к распаковке …/10-mecab-ipadic_2.7.0-20070801+main-3_all.deb …

Распаковывается mecab-ipadic (2.7.0-20070801+main-3) …

Выбор ранее не выбранного пакета mecab-ipadic-utf8.

Подготовка к распаковке …/11-mecab-ipadic-utf8_2.7.0-20070801+main-3_all.deb …

Распаковывается mecab-ipadic-utf8 (2.7.0-20070801+main-3) …

Выбор ранее не выбранного пакета mysql-server.

Подготовка к распаковке …/12-mysql-server_8.0.34-1ubuntu22.04_amd64.deb …

Распаковывается mysql-server (8.0.34-1ubuntu22.04) …

Настраивается пакет libmecab2:amd64 (0.996-14build9) …

Настраивается пакет mysql-common (8.0.34-1ubuntu22.04) …

update-alternatives: используется /etc/mysql/my.cnf.fallback для предоставления /etc/mysql/my.cnf (my.cnf) в автоматическом режиме

Настраивается пакет mecab-utils (0.996-14build9) …

Настраивается пакет mysql-community-client-plugins (8.0.34-1ubuntu22.04) …

Настраивается пакет libaio1:amd64 (0.3.112-13build1) …

Настраивается пакет mecab-ipadic (2.7.0-20070801+main-3) …

Compiling IPA dictionary for Mecab.  This takes long time...

reading /usr/share/mecab/dic/ipadic/unk.def ... 40

emitting double-array: 100% |###########################################| 

/usr/share/mecab/dic/ipadic/model.def is not found. skipped.

reading /usr/share/mecab/dic/ipadic/Noun.number.csv ... 42

reading /usr/share/mecab/dic/ipadic/Verb.csv ... 130750

reading /usr/share/mecab/dic/ipadic/Noun.demonst.csv ... 120

reading /usr/share/mecab/dic/ipadic/Interjection.csv ... 252

reading /usr/share/mecab/dic/ipadic/Noun.verbal.csv ... 12146

reading /usr/share/mecab/dic/ipadic/Symbol.csv ... 208

reading /usr/share/mecab/dic/ipadic/Noun.adjv.csv ... 3328

reading /usr/share/mecab/dic/ipadic/Noun.csv ... 60477

reading /usr/share/mecab/dic/ipadic/Noun.others.csv ... 151

reading /usr/share/mecab/dic/ipadic/Noun.nai.csv ... 42

reading /usr/share/mecab/dic/ipadic/Postp-col.csv ... 91

reading /usr/share/mecab/dic/ipadic/Filler.csv ... 19

reading /usr/share/mecab/dic/ipadic/Conjunction.csv ... 171

reading /usr/share/mecab/dic/ipadic/Prefix.csv ... 221

reading /usr/share/mecab/dic/ipadic/Noun.proper.csv ... 27328

reading /usr/share/mecab/dic/ipadic/Noun.org.csv ... 16668

reading /usr/share/mecab/dic/ipadic/Suffix.csv ... 1393

reading /usr/share/mecab/dic/ipadic/Adverb.csv ... 3032

reading /usr/share/mecab/dic/ipadic/Auxil.csv ... 199

reading /usr/share/mecab/dic/ipadic/Others.csv ... 2

reading /usr/share/mecab/dic/ipadic/Noun.place.csv ... 72999

reading /usr/share/mecab/dic/ipadic/Postp.csv ... 146

reading /usr/share/mecab/dic/ipadic/Noun.name.csv ... 34202

reading /usr/share/mecab/dic/ipadic/Adnominal.csv ... 135

reading /usr/share/mecab/dic/ipadic/Adj.csv ... 27210

reading /usr/share/mecab/dic/ipadic/Noun.adverbal.csv ... 795

emitting double-array: 100% |###########################################| 

reading /usr/share/mecab/dic/ipadic/matrix.def ... 1316x1316

emitting matrix      : 100% |###########################################| 



done!

update-alternatives: используется /var/lib/mecab/dic/ipadic для предоставления /var/lib/mecab/dic/debian (mecab-dictionary) в автоматическом режиме

Настраивается пакет mysql-community-client-core (8.0.34-1ubuntu22.04) …

Настраивается пакет mysql-community-server-core (8.0.34-1ubuntu22.04) …

Настраивается пакет mecab-ipadic-utf8 (2.7.0-20070801+main-3) …

Compiling IPA dictionary for Mecab.  This takes long time...

reading /usr/share/mecab/dic/ipadic/unk.def ... 40

emitting double-array: 100% |###########################################| 

/usr/share/mecab/dic/ipadic/model.def is not found. skipped.

reading /usr/share/mecab/dic/ipadic/Noun.number.csv ... 42

reading /usr/share/mecab/dic/ipadic/Verb.csv ... 130750

reading /usr/share/mecab/dic/ipadic/Noun.demonst.csv ... 120

reading /usr/share/mecab/dic/ipadic/Interjection.csv ... 252

reading /usr/share/mecab/dic/ipadic/Noun.verbal.csv ... 12146

reading /usr/share/mecab/dic/ipadic/Symbol.csv ... 208

reading /usr/share/mecab/dic/ipadic/Noun.adjv.csv ... 3328

reading /usr/share/mecab/dic/ipadic/Noun.csv ... 60477

reading /usr/share/mecab/dic/ipadic/Noun.others.csv ... 151

reading /usr/share/mecab/dic/ipadic/Noun.nai.csv ... 42

reading /usr/share/mecab/dic/ipadic/Postp-col.csv ... 91

reading /usr/share/mecab/dic/ipadic/Filler.csv ... 19

reading /usr/share/mecab/dic/ipadic/Conjunction.csv ... 171

reading /usr/share/mecab/dic/ipadic/Prefix.csv ... 221

reading /usr/share/mecab/dic/ipadic/Noun.proper.csv ... 27328

reading /usr/share/mecab/dic/ipadic/Noun.org.csv ... 16668

reading /usr/share/mecab/dic/ipadic/Suffix.csv ... 1393

reading /usr/share/mecab/dic/ipadic/Adverb.csv ... 3032

reading /usr/share/mecab/dic/ipadic/Auxil.csv ... 199

reading /usr/share/mecab/dic/ipadic/Others.csv ... 2

reading /usr/share/mecab/dic/ipadic/Noun.place.csv ... 72999

reading /usr/share/mecab/dic/ipadic/Postp.csv ... 146

reading /usr/share/mecab/dic/ipadic/Noun.name.csv ... 34202

reading /usr/share/mecab/dic/ipadic/Adnominal.csv ... 135

reading /usr/share/mecab/dic/ipadic/Adj.csv ... 27210

reading /usr/share/mecab/dic/ipadic/Noun.adverbal.csv ... 795

emitting double-array: 100% |###########################################| 

reading /usr/share/mecab/dic/ipadic/matrix.def ... 1316x1316

emitting matrix      : 100% |###########################################| 



done!

update-alternatives: используется /var/lib/mecab/dic/ipadic-utf8 для предоставления /var/lib/mecab/dic/debian (mecab-dictionary) в автоматическом режиме

Настраивается пакет mysql-community-client (8.0.34-1ubuntu22.04) …

Настраивается пакет mysql-client (8.0.34-1ubuntu22.04) …

Настраивается пакет mysql-community-server (8.0.34-1ubuntu22.04) …

update-alternatives: используется /etc/mysql/mysql.cnf для предоставления /etc/mysql/my.cnf (my.cnf) в автоматическом режиме



Created symlink /etc/systemd/system/multi-user.target.wants/mysql.service → /lib/systemd/system/mysql.service.

Настраивается пакет mysql-server (8.0.34-1ubuntu22.04) …

Обрабатываются триггеры для man-db (2.10.2-1) …

Обрабатываются триггеры для libc-bin (2.35-0ubuntu3.3) …

rooney@rooney-ubuntu:~/work2$ 
```
### Задание 4
Установить и удалить deb-пакет с помощью dpkg.
```
rooney@rooney-ubuntu:~/work2$ wget http://archive.ubuntu.com/ubuntu/pool/universe/c/cowsay/cowsay_3.03+dfsg2-4_all.deb

--2023-10-05 22:50:00--  http://archive.ubuntu.com/ubuntu/pool/universe/c/cowsay/cowsay_3.03+dfsg2-4_all.deb

Распознаётся archive.ubuntu.com (archive.ubuntu.com)… 91.189.91.81, 185.125.190.36, 91.189.91.82, ...

Подключение к archive.ubuntu.com (archive.ubuntu.com)|91.189.91.81|:80... соединение установлено.

HTTP-запрос отправлен. Ожидание ответа… 200 OK

Длина: 17684 (17K) [application/vnd.debian.binary-package]

Сохранение в: ‘cowsay_3.03+dfsg2-4_all.deb’



cowsay_3.03+dfsg2-4_all.deb   100%[=================================================>]  17,27K  --.-KB/s    за 0,1s    



2023-10-05 22:50:00 (138 KB/s) - ‘cowsay_3.03+dfsg2-4_all.deb’ сохранён [17684/17684]



rooney@rooney-ubuntu:~/work2$ sudo dpkg -i cowsay_3.03+dfsg2-4_all.deb

Выбор ранее не выбранного пакета cowsay.

(Чтение базы данных … на данный момент установлено 187210 файлов и каталогов.)

Подготовка к распаковке cowsay_3.03+dfsg2-4_all.deb …

Распаковывается cowsay (3.03+dfsg2-4) …

Настраивается пакет cowsay (3.03+dfsg2-4) …

Обрабатываются триггеры для man-db (2.10.2-1) …

rooney@rooney-ubuntu:~/work2$ cowsay

Hi

dsfd

 _________

< Hi dsfd >

 ---------

        \   ^__^

         \  (oo)\_______

            (__)\       )\/\

                ||----w |

                ||     ||

rooney@rooney-ubuntu:~/work2$ sudo dpkg -r cowsay

(Чтение базы данных … на данный момент установлено 187268 файлов и каталогов.)

Удаляется cowsay (3.03+dfsg2-4) …

Обрабатываются триггеры для man-db (2.10.2-1) …

rooney@rooney-ubuntu:~/work2$ sudo dpkg -P cowsay

dpkg: предупреждение: игнорируется запрос на удаление неустановленного пакета cowsay

rooney@rooney-ubuntu:~/work2$ man cowsay

Нет справочной страницы для cowsay

rooney@rooney-ubuntu:~/work2$ 
```
### Задание 5
Выложить историю команд в терминале ubuntu
```
rooney@rooney-ubuntu:~/work2$ history

    1  sudo apt update

    2  whereis

    3  where is --help

    4  whereis --help

    5  sudo apt-get -f

    6  sudo apt-get-f

    7  sudo apt-get -f

    8  sudo apt -f

    9  sudo apt apdate

   10  sudo apt update

   11  sudo apt list --upgradable

   12  sudo apt upgrade

   13  sudo apt-get install \ ca-sertificates \ curl \ gnupg \lsb-release

   14  sudo apt-get install \ca-sertificates\curl\gnupg\lsb-release

   15  sudo apt-get install \ca-sertificates \ curl \ gnupg \ lsb-release

   16  ll /

   17  sudo apt install \ca-sertificates \ curl \ gnupg \ lsb-release

   18  sudo apt install ca-sertificates curl gnupg lsb-release

   19  sudo apt install ca-certificates curl gnupg lsb-release

   20  sudo apt install mc

   21  sudo apt install openssh-server

   22  sudo apt install gcc make perl -y

   23  sudo reboot

   24  docker ps

   25  sudo docker ps

   26  sudo docker compose stop

   27  cd ~\Docker\Dockerfile

   28  cd ~/Docker/Dockerfile

   29  sudo docker compose stop

   30  sudo apt-get update

   31  sudo apt-get install ca-certificates curl gnupg lsb-release

   32  sudo mkdir -p /etc/apt/keyrings

   33  curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /etc/apt/keyrings/docker.gpg

   34  echo "deb [arch=$(dpkg --print-architecture)

   35  signed-by=/etc/apt/keyrings/docker.gpg]

   36  https://download.docker.com/linux/ubuntu \

   37  $(lsb_release -cs) stable" | sudo tee

   38  /etc/apt/sources.list.d/docker.list > /dev/null

   39  echo "deb [arch=$(dpkg --print-architecture)

   40  signed-by=/etc/apt/keyrings/docker.gpg]

   41  https://download.docker.com/linux/ubuntu \

   42  $(lsb_release -cs) stable" | sudo tee

   43  /etc/apt/sources.list.d/docker.list > /dev/null

   44  sudo apt update

   45  sudo apt-get install docker-ce docker-ce-cli containerd.io docker-compose-plugin

   46  ll /etc/apt/sources.list.d

   47  ll /etc/apt/keyrings

   48  clear

   49  echo "deb [arch=$(dpkg --print-architecture) signed-by=/etc/apt/keyrings/docker.gpg] https://download.docker.com/linux/ubuntu \

   50  $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

   51  sudo apt update

   52  sudo apt-get install docker-ce docker-ce-cli containerd.io docker-compose-plugin

   53  docker --help

   54  clear

   55  l

   56  ll

   57  mkdir Docker

   58  ll

   59  mkdir ./Docker/Dockerfile

   60  cd ./Docker/Dockerfile/

   61  nano Dockerfile

   62  docker build --?

   63  docker build --help

   64  docker build -t my_nginx_container .

   65  sudo docker build -t my_nginx_container .

   66  docker ps -a

   67  sudo docker ps -a

   68  sudo docker psi -a

   69  sudo docker images

   70  sudo docker rmi b79156bc8a79

   71  clear

   72  cat Dockerfile

   73  sudo docker build -t my_nginx_container .

   74  docker images

   75  sudo docker images

   76  docker run -p 8081:80 -d --name my_nginx_container1  my_nginx_container

   77  sudo docker run -p 8081:80 -d --name my_nginx_container1  my_nginx_container

   78  docker ps

   79  sudo docker ps

   80  sudo docker exec -it my_nginx_container1 bash

   81  sudo docker stop  my_nginx_container1

   82  sudo docker ps

   83  sudo docker ps -a

   84  claer

   85  clear

   86  ll

   87  cat Dockerfile

   88  nano docker-compose.yml

   89  nano Dockerfile1

   90  cat docker-compose.yml 

   91  nano Dockerfile1

   92  nano docker-compose.yml

   93  cat docker-compose.yml 

   94  cat Dockerfile1

   95  mkdir myfolder

   96  ll

   97  docker compose up

   98  nano docker-compose.yml

   99  clear

  100  cat docker-compose.yml 

  101  cat Dockerfile1

  102  ll

  103  docker compose up

  104  nano docker-compose.yml

  105  clear

  106  cat docker-compose.yml 

  107  cat Dockerfile1

  108  ll

  109  docker compose up

  110  sudo docker compose up

  111  mkdir work2

  112  cd work2

  113  cat>домашниеживотные.txt

  114  cat>вьючныеживотные.txt

  115  cat домашниеживотные.txt вьючныеживотные.txt > .txдрузьячеловека.txt

  116  cat друзьячеловека.txt

  117  ls

  118  cat домашниеживотные.txt вьючныеживотные.txt > друзьячеловека.txt

  119  ls

  120  cat друзьячеловека.txt

  121  clear

  122* rm 

  123  rm  домашниеживотные.txt вьючныеживотные.txt  друзьячеловека.txt

  124  ls

  125  ll

  126  rm .txдрузьячеловека.txt

  127  ls

  128  ll

  129  clear

  130  cat>домашниеживотные.txt

  131  cat>вьючныеживотные.txt

  132  cat домашниеживотные.txt вьючныеживотные.txt > друзьячеловека.txt

  133  ll

  134  cat друзьячеловека.txt

  135  mv друзьячеловека.txt друзья_человека.txt

  136  ll

  137  mkdir result

  138  mv друзья_человека.txt result

  139  ll

  140  ll result

  141  lsb_release

  142  lsb_release -a

  143  ll ~

  144  ll ~/Загрузки

  145  pwd

  146  sudo dpkg -i /home/rooney/Загрузки/mysql-apt-config_0.8.26-1_all.deb

  147  sudo apt get update

  148  sudo apt-get update

  149  sudo dpkg -l

  150  mc

  151  sudo apt remove mc

  152  mc

  153  sudo dpkg -l

  154  sudo dpkg -i mc:3:4.8.27-1

  155  sudo dpkg -i mc

  156  wget http://archive.ubuntu.com/ubuntu/pool/universe/c/cowsay/cowsay_3.03+dfsg2-4_all.deb

  157  sudo dpkg -i cowsay_3.03+dfsg2-4_all.deb

  158  mc

  159  cowsay

  160  sudo dpkg -r cowsay

  161  sudo dpkg -P cowsay

  162  man cowsay

  163  history
```
### Задание 6
Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).

![Диаграмма зависимостей классов](/src/main/java/ru/gb/model/db/Animal.png "Диаграмма зависимостей классов")
### Задание 7
В подключенном MySQL репозитории создать базу данных “Друзья
человека”
```
rooney@rooney-ubuntu:~/work2$ mysql -u root -p

Enter password: 

Welcome to the MySQL monitor.  Commands end with ; or \g.

Your MySQL connection id is 9

Server version: 8.0.34 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its

affiliates. Other names may be trademarks of their respective

owners.



Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.


mysql> create database human_friends;

Query OK, 1 row affected (0,05 sec)

mysql> show databases;

+--------------------+

| Database           |

+--------------------+

| human_friends      |

| information_schema |

| mysql              |

| performance_schema |

| sys                |

+--------------------+

5 rows in set (0,01 sec)
```
### Задание 8
Создать таблицы с иерархией из диаграммы в БД
```
mysql> use human_friends;

Database changed

mysql> create table animals ( 

    -> id_animals int NOT NULL AUTO_INCREMENT PRIMARY KEY,

    -> name varchar(100) NOT NULL);

Query OK, 0 rows affected (0,08 sec)

mysql> insert into animals (name)

    -> values("home_animals"),("baggade_animals");

Query OK, 2 rows affected (0,03 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> select * from animals;

+------------+-----------------+

| id_animals | name            |

+------------+-----------------+

|          1 | home_animals    |

|          2 | baggade_animals |

+------------+-----------------+

2 rows in set (0,00 sec)



mysql> create table baggade_animals ( id_baggade_animals int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_animals int NOT NULL, foreign key (id_animals) references animals(id_animals));

Query OK, 0 rows affected (0,10 sec)



mysql> insert into baggade_animals (name, id_animals) values( "horse",2),("donkey",2),("camel",2);

Query OK, 3 rows affected (0,03 sec)

Records: 3  Duplicates: 0  Warnings: 0



mysql> create table home_animals ( id_home_animals int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_animals int NOT NULL, foreign key (id_animals) references animals(id_animals));

Query OK, 0 rows affected (0,11 sec)



mysql> insert into home_animals (name, id_animals) values( "dog",1),("cat",1),("hamster",1);

Query OK, 3 rows affected (0,02 sec)

Records: 3  Duplicates: 0  Warnings: 0



mysql> select * from home_animals;

+-----------------+---------+------------+

| id_home_animals | name    | id_animals |

+-----------------+---------+------------+

|               1 | dog     |          1 |

|               2 | cat     |          1 |

|               3 | hamster |          1 |

+-----------------+---------+------------+

3 rows in set (0,00 sec)



mysql> create table dog( id_dog int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_home_animals int NOT NULL,birthday date, foreign key (id_home_animals) references home_animals(id_home_animals));

Query OK, 0 rows affected (0,12 sec)



mysql> create table cat( id_cat int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_home_animals int NOT NULL,birthday date, foreign key (id_home_animals) references home_animals(id_home_animals));

Query OK, 0 rows affected (0,14 sec)



mysql> create table hamster( id_hamster int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_home_animals int NOT NULL,birthday date, foreign key (id_home_animals) references home_animals(id_home_animals));



Query OK, 0 rows affected (0,11 sec)



mysql> create table horse( id_horse int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_baggade_animals int NOT NULL, birthday date, foreign key (id_baggade_animals) references baggade_animals(id_baggade_animals));

Query OK, 0 rows affected (0,12 sec)



mysql> create table camel( id_camel int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_baggade_animals int NOT NULL,birthday date, foreign key (id_baggade_animals) references baggade_animals(id_baggade_animals));

Query OK, 0 rows affected (0,10 sec)



mysql> create table donkey( id_donkey int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_baggade_animals int NOT NULL,birthday date, foreign key (id_baggade_animals) references baggade_animals(id_baggade_animals));

Query OK, 0 rows affected (0,10 sec)



mysql> show tables;

+-------------------------+

| Tables_in_human_friends |

+-------------------------+

| animals                 |

| baggade_animals         |

| camel                   |

| cat                     |

| dog                     |

| donkey                  |

| hamster                 |

| home_animals            |

| horse                   |

+-------------------------+

9 rows in set (0,00 sec)

mysql> create table animals_command( id_animals_command int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL);

Query OK, 0 rows affected (0,08 sec)


mysql> create table dog_2_animals_command( id_dog_2_animals_command int NOT NULL AUTO_INCREMENT PRIMARY KEY, id_dog int NOT NULL, id_animals_command int NOT NULL, foreign key (id_animals_command) references animals_command(id_animals_command), foreign key (id_dog) references dog (id_dog));

Query OK, 0 rows affected (0,16 sec)



mysql> create table cat_2_animals_command( id_cat_2_animals_command int NOT NULL AUTO_INCREMENT PRIMARY KEY, id_cat int NOT NULL, id_animals_command int NOT NULL, foreign key (id_animals_command) referenc

es animals_command(id_animals_command), foreign key (id_cat) references cat (id_cat));

Query OK, 0 rows affected (0,17 sec)



mysql> create table hamster_2_animals_command( id_hamster_2_animals_command int NOT NULL AUTO_INCREMENT PRIMARY KEY, id_hamster int NOT NULL, id_animals_command int NOT NULL, foreign key (id_animals_comma

nd) references animals_command(id_animals_command), foreign key (id_hamster) references hamster (id_hamster));

Query OK, 0 rows affected (0,18 sec)



mysql> create table horse_2_animals_command( id_horse_2_animals_command int NOT NULL AUTO_INCREMENT PRIMARY KEY, id_horse int NOT NULL, id_animals_command int NOT NULL, foreign key (id_animals_command) references animals_command(id_animals_command), foreign key (id_horse) references horse (id_horse));

Query OK, 0 rows affected (0,11 sec)



mysql> create table camel_2_animals_command( id_camel_2_animals_command int NOT NULL AUTO_INCREMENT PRIMARY KEY, id_camel int NOT NULL, id_animals_command int NOT NULL, foreign key (id_animals_command) references animals_command(id_animals_command), foreign key (id_camel) references camel (id_camel));

Query OK, 0 rows affected (0,14 sec)



mysql> create table donkey_2_animals_command( id_donkey_2_animals_command int NOT NULL AUTO_INCREMENT PRIMARY KEY, id_donkey int NOT NULL, id_animals_command int NOT NULL, foreign key (id_animals_command)

 references animals_command(id_animals_command), foreign key (id_donkey) references donkey (id_donkey));

Query OK, 0 rows affected (0,21 sec)



mysql> show tables;

+---------------------------+

| Tables_in_human_friends   |

+---------------------------+

| animals                   |

| animals_command           |

| baggade_animals           |

| camel                     |

| camel_2_animals_command   |

| cat                       |

| cat_2_animals_command     |

| dog                       |

| dog_2_animals_command     |

| donkey                    |

| donkey_2_animals_command  |

| hamster                   |

| hamster_2_animals_command |

| home_animals              |

| horse                     |

| horse_2_animals_command   |

+---------------------------+

16 rows in set (0,00 sec)
```
### Задание 9
Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
```
mysql> insert into dog (name, id_home_animals,birthday)

    -> values ("Sharik",1,"2020-01-01"),("Bim",1,"2015-10-01");

Query OK, 2 rows affected (0,02 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> insert into cat (name, id_home_animals,birthday) values ("Murzik",2,"2015-10-05"),("Chester",2,"2018-10-05");

Query OK, 2 rows affected (0,02 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> insert into hamster (name, id_home_animals, birthday) values ("Boris",3,"2021-01-17");

Query OK, 1 row affected (0,02 sec)



mysql> insert into horse (name, id_baggade_animals, birthday) values ("Zvezda",1,"2021-02-01"),("Merin",1,"2023-02-01");

Query OK, 2 rows affected (0,02 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> insert into donkey (name, id_baggade_animals, birthday) values ("Ia",2,"2013-01-01"),("Colt",2,"2019-01-01");

Query OK, 2 rows affected (0,03 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> insert into camel (name, id_baggade_animals, birthday) values ("First",3,"2013-01-01"),("Second",3,"2013-07-01"),("Bingo",3,"2022-01-01");

Query OK, 3 rows affected (0,01 sec)

Records: 3  Duplicates: 0  Warnings: 0



mysql> insert into animals_command (name) values ("Run"),("Meow"),("Bark"),("Neigh"),("Eat"),("Jump"),("Rustle");

Query OK, 7 rows affected (0,01 sec)

Records: 7  Duplicates: 0  Warnings: 0



mysql> select * from animals_command

    -> ;

+--------------------+--------+

| id_animals_command | name   |

+--------------------+--------+

|                  1 | Run    |

|                  2 | Meow   |

|                  3 | Bark   |

|                  4 | Neigh  |

|                  5 | Eat    |

|                  6 | Jump   |

|                  7 | Rustle |

+--------------------+--------+

7 rows in set (0,00 sec)



mysql> insert into dog_2_animals_command (id_dog,id_animals_command)

    -> select id_dog, 3 from dog;

Query OK, 2 rows affected (0,03 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> insert into cat_2_animals_command (id_cat,id_animals_command) select id_cat, 2 from cat;

Query OK, 2 rows affected (0,03 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> insert into hamster_2_animals_command (id_hamster,id_animals_command) select id_hamster,7  from hamster;

Query OK, 1 row affected (0,01 sec)

Records: 1  Duplicates: 0  Warnings: 0



mysql> insert into horse_2_animals_command (id_horse,id_animals_command) select id_horse,4  from horse;

Query OK, 2 rows affected (0,02 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> insert into donkey_2_animals_command (id_donkey,id_animals_command) select id_donkey,1  from donkey;

Query OK, 2 rows affected (0,02 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> insert into camel_2_animals_command (id_camel,id_animals_command) select id_camel,5  from camel;

Query OK, 3 rows affected (0,02 sec)

Records: 3  Duplicates: 0  Warnings: 0



mysql> insert into dog_2_animals_command (id_dog,id_animals_command) values (1, 6);

Query OK, 1 row affected (0,01 sec)



mysql> select * from dog_2_animals_command;

+--------------------------+--------+--------------------+

| id_dog_2_animals_command | id_dog | id_animals_command |

+--------------------------+--------+--------------------+

|                        1 |      1 |                  3 |

|                        2 |      2 |                  3 |

|                        4 |      1 |                  6 |

+--------------------------+--------+--------------------+

3 rows in set (0,00 sec)
```
### Задание 10
Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
```
-- УДАЛЕНИЕ ВЕРБЛЮДОВ

mysql> start transaction;

Query OK, 0 rows affected (0,00 sec)

mysql> delete from camel_2_animals_command;

Query OK, 3 rows affected (0,01 sec)

mysql> delete from camel;

Query OK, 3 rows affected (0,00 sec)

mysql> commit;

Query OK, 0 rows affected (0,01 sec)


mysql> select * from camel;

Empty set (0,00 sec)

-- ОБЪЕДИНЕНИЕ ЛОШАДЕЙ И ОСЛОВ

mysql> create table horse_and_donkey LIKE horse;

Query OK, 0 rows affected (0,10 sec)

mysql> insert into horse_and_donkey(name,id_baggade_animals,birthday)

    -> select name,id_baggade_animals,birthday from horse

    -> UNION 

    -> select name,id_baggade_animals,birthday from donkey;

Query OK, 4 rows affected (0,02 sec)

Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from horse_and_donkey;

+----------+--------+--------------------+------------+

| id_horse | name   | id_baggade_animals | birthday   |

+----------+--------+--------------------+------------+

|        1 | Zvezda |                  1 | 2021-02-01 |

|        2 | Merin  |                  1 | 2023-02-01 |

|        3 | Ia     |                  2 | 2013-01-01 |

|        4 | Colt   |                  2 | 2019-01-01 |

+----------+--------+--------------------+------------+

4 rows in set (0,00 sec)
```
### Задание 11
Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
```
mysql> create table young_animals( id_young_animals int NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(100) NOT NULL, id_animals int NOT NULL, id_home_or_baggade_animals int NOT NULL, birthday Date,age_in_month int);

Query OK, 0 rows affected (0,09 sec)



mysql> insert into young_animals(name,id_animals,id_home_or_baggade_animals,birthday,age_in_month)

    -> select name,1, id_home_animals,birthday,TIMESTAMPDIFF(month,birthday,now()) from dog where birthday <  date_add(now(), interval -1 year) and birthday> date_add(now(), interval -3 year)

    -> UNION

    -> select name,1, id_home_animals,birthday,TIMESTAMPDIFF(month,birthday,now()) from cat where birthday <  date_add(now(), interval -1 year) and birthday> date_add(now(), interval -3 year)

    -> UNION

    -> select name,1, id_home_animals,birthday,TIMESTAMPDIFF(month,birthday,now()) from hamster where birthday <  date_add(now(), interval -1 year) and birthday> date_add(now(), interval -3 year)

    -> UNION

    -> select name,2, id_baggade_animals,birthday,TIMESTAMPDIFF(month,birthday,now()) from horse where birthday <  date_add(now(), interval -1 year) and birthday> date_add(now(), interval -3 year)

    -> UNION

    -> select name,2, id_baggade_animals,birthday,TIMESTAMPDIFF(month,birthday,now()) from donkey where birthday <  date_add(now(), interval -1 year) and birthday> date_add(now(), interval -3 year);

Query OK, 2 rows affected (0,01 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> select * from young_animals;

+------------------+--------+------------+----------------------------+------------+--------------+

| id_young_animals | name   | id_animals | id_home_or_baggade_animals | birthday   | age_in_month |

+------------------+--------+------------+----------------------------+------------+--------------+

|                1 | Boris  |          1 |                          3 | 2021-01-17 |           32 |

|                2 | Zvezda |          2 |                          1 | 2021-02-01 |           32 |

+------------------+--------+------------+----------------------------+------------+--------------+

2 rows in set (0,00 sec)

```
### Задание 12
Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.
```
mysql> select id_dog as id,name,id_home_animals,null as id_baggade_animals,birthday from dog

    -> union

    -> select id_cat as id,name,id_home_animals,null,birthday from cat

    -> union

    -> select id_hamster as id,name,id_home_animals,null,birthday from hamster

    -> union

    -> select id_horse as id,name,null,id_baggade_animals,birthday from horse

    -> union

    -> select id_donkey as id,name,null,id_baggade_animals,birthday from donkey;

+----+---------+-----------------+------+------------+

| id | name    | id_home_animals | id_baggade_animals | birthday   |

+----+---------+-----------------+------+------------+

|  1 | Sharik  |               1 | NULL | 2020-01-01 |

|  2 | Bim     |               1 | NULL | 2015-10-01 |

|  1 | Murzik  |               2 | NULL | 2015-10-05 |

|  2 | Chester |               2 | NULL | 2018-10-05 |

|  1 | Boris   |               3 | NULL | 2021-01-17 |

|  1 | Zvezda  |            NULL |    1 | 2021-02-01 |

|  2 | Merin   |            NULL |    1 | 2023-02-01 |

|  1 | Ia      |            NULL |    2 | 2013-01-01 |

|  2 | Colt    |            NULL |    2 | 2019-01-01 |

+----+---------+-----------------+------+------------+

9 rows in set (0,00 sec)
```
### Задание 13
Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
```
Реализовано в рамках разработки программы питомника.
```
### Задание 14 
Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:
* Завести новое животное
* определять животное в правильный класс
* увидеть список команд, которое выполняет животное
* обучить животное новым командам
* Реализовать навигацию по меню
```
Реализовано в рамках разработки программы питомника.
В пункте увидеть список команд животного, реализован вывод всех животных определенного класса
с их характеристиками и выполняемыми командами
```
### Задание 15
Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆
значение внутренней̆int переменной̆на 1 при нажатие “Завести новое
животное” Сделайте так, чтобы с объектом такого типа можно было работать в
блоке try-with-resources. Нужно бросить исключение, если работа с объектом
типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.
```
Реализовано в рамках разработки программы питомника.
Создан класс Counter, который используется для присвоения уникального id животному. Задействован в классе AnimalsList
```