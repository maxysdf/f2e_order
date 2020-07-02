F2E_order
================================

## 目的
實作題目F2E ( https://hackmd.io/2qvqmKxgTDaDpjPxpsNiYw)

## 環境需求
* JDK 1.8+

以下為編譯之需求:
* Maven 3.x (https://maven.apache.org/install.html )
* Internet連線

## 編譯與執行
為了讓程式能盡量在本機執行, project中將deploy目錄留下來, 可直接以java執行
* windows: 執行run.bat
* linux: 執行./run.sh

若要編譯, 則在後面加compile參數:
* windows: 執行run.bat compile
* linux: 執行./run.sh compile

![run](https://github.com/maxysdf/f2e_order/blob/master/screenshot/00_run.png?raw=true)

啟動後進入 http://localhost:8080/ :
![ui](https://github.com/maxysdf/f2e_order/blob/master/screenshot/01_ui.png?raw=true)

Ajax資料:
![ajax](https://github.com/maxysdf/f2e_order/blob/master/screenshot/02_ajax_resp.png?raw=true)

更新訂單資料:
訂單資料是以一個yaml檔存放, 檔案為deploy目錄的conf/data/orders.yaml, 可以新增資料; 存檔後app自動重啟
![data](https://github.com/maxysdf/f2e_order/blob/master/screenshot/03_update_data.png?raw=true)
![updated](https://github.com/maxysdf/f2e_order/blob/master/screenshot/04_ui_updated.png?raw=true)

## 實作說明
### 後端
0. 準備訂單資料, 目前先以yaml檔存放
1. DAO讀取訂單model
2. Service將model轉為VO, 並排序
3. VO拋回前端

### 前端
0. 以Vue.js做為頁面的MVC框架
1. 於vue mounted時, 利用axios發送ajax至後端, 取得訂單清單
2. vue渲染出結果畫面


