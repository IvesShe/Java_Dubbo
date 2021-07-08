# Java Dubbo

Dubbo筆記

# Dubbo 官網

有中文的簡介及架構介紹

https://dubbo.apache.org/zh/docs/v2.7/user/preface/background/


![image](./images/20210708095903.png)


GitHub

https://github.com/apache/dubbo

# RPC

RPC(Remote Procedure Call)是指遠程進程調用，是一種進程通信方式。

RCC有兩個核心模塊：通訊、序列化。

RPC框架有很多如：

- dubbo
- gRPC
- Thrift
- HSF

# 使用ZooKeeper當註冊中心

安裝及使用參考這篇文檔

https://github.com/IvesShe/Java_ZooKeeper


# Dubbo Admin

https://github.com/apache/dubbo-admin/tree/master

![image](./images/20210708103820.png)

## 修改zookeepe位址

zookeeper://35.229.195.168:2181，圖片的地址打錯了

![image](./images/20210708104152.png)

## 使用maven打個jar包

```bash
mvn clean package

```

![image](./images/20210708104441.png)

![image](./images/20210708104458.png)

得到jar包

![image](./images/20210708104740.png)

## 運行jar包

```bash
java -jar dubbo-admin-0.0.1-SNAPSHOT.jar
```

成功運行在7001端口

![image](./images/20210708105900.png)

## 訪問

localhost:7001

預設帳號密碼都是root

成功訪問

![image](./images/20210708110436.png)

![image](./images/20210708110634.png)

(如果服務器沒反應，可在cmd視窗按ctrl+c試)

從zookeeper查看，也多了一個dubbo的節點

![image](./images/20210708110722.png)


# 創建新專案 及模塊

![image](./images/20210708153528.png)

創建模塊user-service-provider，GroupID是com.ives.gmall，圖中打錯

![image](./images/20210708154154.png)


創建完成

![image](./images/20210708154213.png)

創建order-service-consumer

![image](./images/20210708155025.png)

再創建gmall-interface

![image](./images/20210708192330.png)

共用的接口及bean放在gmall-interface

![image](./images/20210708200257.png)

# ZooKeeper配置

參考

https://dubbo.apache.org/zh/docs/v2.7/user/configuration/config-center/

![image](./images/20210708212020.png)

# Dubbo查看

運行寫好的代碼，查看Dubbo

運行提供者

![image](./images/20210708200411.png)

![image](./images/20210708200437.png)

![image](./images/20210708200459.png)

![image](./images/20210708200517.png)

新增消費者

![image](./images/20210708205934.png)

![image](./images/20210708205948.png)

![image](./images/20210708210012.png)

# dubbo-monitor-simple

簡單的監控中心

在之前捉的文件裡

![image](./images/20210708210349.png)

## 修改zookeepe位址

![image](./images/20210708210803.png)

## 打個jar包

```bash
mvn clean package
```

![image](./images/20210708211051.png)

![image](./images/20210708211129.png)

解壓縮這個資料夾

![image](./images/20210708211504.png)

運行目錄裡的start.bat

![image](./images/20210708211559.png)

![image](./images/20210708211628.png)

# 訪問監控中心

http://localhost:8080/

![image](./images/20210708211739.png)

# 配置監控中心

可參考

https://dubbo.apache.org/zh/docs/v2.7/user/simple-monitor/

![image](./images/20210708212207.png)

設置好配置檔，重新運行後，成功查看到服務了

![image](./images/20210708212816.png)
