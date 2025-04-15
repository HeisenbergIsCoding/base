# 微服務架構基礎框架

這是一個基於Spring Boot的微服務架構基礎框架，提供了常見的微服務組件和基礎設施。

## 系統架構

該項目採用現代微服務架構設計，包含以下核心組件：

- **API 網關**：系統的統一入口，負責請求路由、負載均衡、認證等
- **認證服務**：處理用戶認證與授權
- **服務註冊中心**：服務發現與註冊
- **配置中心**：集中管理配置
- **分佈式追蹤/效能監控**：Prometheus/Grafana/Zipkin，追蹤請求流程與效能指標
- **消息代理**：處理服務間非同步通信
- **日誌集中監控**：ELK Stack（Elasticsearch, Logstash, Kibana）
- **通用工具**：共享的工具類和功能
- **Web 前端**：用戶界面

## 技術棧

- **開發語言**：Java 17
- **框架**：Spring Boot 3.4.4
- **構建工具**：Maven
- **服務發現**：Spring Cloud (Eureka)
- **配置管理**：Spring Cloud Config
- **API 網關**：Spring Cloud Gateway
- **認證授權**：OAuth2/JWT
- **分佈式追蹤**：Spring Cloud Sleuth/Zipkin
- **消息中間件**：Kafka/RabbitMQ
- **監控**：Prometheus/Grafana/Zipkin/ELK

## 模塊說明

- **api-gateway**：API 網關服務
- **auth-service**：認證和授權服務
- **service-registry**：服務註冊與發現中心
- **config-server**：集中配置管理服務
- **common-utils**：共享的工具類和功能
- **tracing-service**：分佈式追蹤服務
- **message-broker**：消息代理服務
- **logging-monitoring**：日誌、指標、分散式追蹤與監控服務（僅含設定檔與 docker-compose，不含程式碼）
- **web**：前端應用

## 快速開始

### 環境需求

- JDK 17+
- Maven 3.6+

### 構建與運行

1. 克隆項目
```bash
git clone https://github.com/yourusername/base.git
cd base
```

2. 構建項目
```bash
mvn clean install
```

3. 啟動服務（按順序）
```bash
# 1. 啟動服務註冊中心
cd service-registry
mvn spring-boot:run

# 2. 啟動配置中心
cd ../config-server
mvn spring-boot:run

# 3. 啟動其他服務
cd ../auth-service
mvn spring-boot:run

cd ../api-gateway
mvn spring-boot:run

# 啟動其他服務...

# 4. 啟動集中監控服務（ELK/Prometheus/Grafana/Zipkin）
cd ../logging-monitoring
# 一鍵啟動所有監控服務
# 須先安裝 Docker 與 docker-compose
# 會自動啟動 ELK、Prometheus、Grafana、Zipkin
# 相關設定檔請見 logging-monitoring 目錄

docker-compose up -d
```

## 開發指南

### 新增微服務

1. 在根目錄下創建新的模塊
2. 在根 pom.xml 中添加模塊引用
3. 確保新服務在服務註冊中心註冊

### 配置管理

所有服務的配置集中在 `config-server` 管理，本地開發可使用本地配置。

## 項目狀態

目前項目已建構完成微服務主架構，集中監控（ELK、Prometheus、Grafana、Zipkin）已可即時運作，通用工具庫與各服務可持續擴充。

## 許可證

[MIT License](LICENSE) 