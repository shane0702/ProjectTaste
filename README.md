曾信堯的專案
名稱：嚐室甜點工作室購物網站
功能：
1.首頁導覽	有質感的首頁 
	商品圖 點擊可以看詳細照片/導購到商品導覽頁面
2.關於我們	簡單的關於嚐室概念以及創立由來
3.購物車	增刪改查商品 
	結帳功能
4.會員	註冊會員
	登入會員 
	忘記密碼 
	註冊資料傳送到後台
5.商品總覽	
	每一樣商品圖的介紹/成分/熱量
	增加至購物車

預期使用工具：
前端：html + css + Javascript + vue
模板：bootstrap
後端：spring boot + mySQL + mybatis + java + maven


專案契機：
嚐室甜點工作室是某一天我朋友拿了他手作的可麗露分給我們吃之後，我隨口說了一句你要不要拿去賣啊，我可以去學怎麼寫網站啊，我們分工合作，自此便開始了這個想法的實現。

建網站路程：
學習完一輪Java基本知識後，接觸到了spring家族，開始把學習到的知識轉換成網站的樣子，但是卻碰到依樣畫葫蘆寫好了功能卻沒有前端頁面可以串接，於是又回頭邊學邊實現網頁畫面。
[首頁/關於我們]
首頁是我認為一個網頁最重要的門面，我希望是簡單、溫暖但又要清楚行銷到產品，所以選擇手寫字、一目瞭然的商品圖片以及商品訂購資訊。背景我選擇用溫暖的橘色搭配簡單的手繪圖作為所有頁面的底層。

[未來優化]：
1.增加一鍵置頂功能
2.點擊商品圖片跳轉到商品內容
3.文字排版優化

[購物車功能]：
目前還未實現功能，所以先以google表單和Line接單為主，
支付方式以匯款為主。
購物車基本功能：
前置：確認用戶有沒有登入會員 有，繼續動作 沒有，先登入
查：查看購物車內是否有商品
增：顧客添加商品和增加商品數量
改：更動商品數量，如果數量小於1，則商品移除
刪：移除商品
[未來優化]：
1.商品結帳
2.第三方支付

[會員登入]：
註冊功能：用戶基本資料連結到資料庫
1. 用戶帳號設定成信箱
2. 密碼
3. 生日
4. 聯絡資訊
會員攔截功能，用戶要登入才可以結帳

[未來優化]：
認證碼功能
忘記密碼

[網站後台]：
登入功能：
1.登入攔截器：沒有登入所有後台資訊都進不去
2.接收訂單
3.會員資料
4.銷售資料彙整
這裡可以去bootstrap找模板套用，重點是如何串接前後端

[心得]：
大言不慚地跟朋友說你開工作室我幫你架網站，實際動手的時候一直重複著被非常小的bug搞得非常崩潰，把一個又一個看不懂的單詞丟上Google然後得到解答，花費了半年才完成很皮毛的成果，但我看見目前的成果真的很有成就感，但我深知自己還非常非常不足，做完頁面跟功能還有安全性、上架等等的要學習，因此我想最快速磨練自己的就是投身於職場。最後我會一直嘗試把嚐室完成。




