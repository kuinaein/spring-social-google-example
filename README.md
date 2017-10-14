# Spring Social における Google SSO連携サンプル
spring-social-google を利用した、 Google アカウントによるシングルサインオンのサンプルです。

http://localhost:8080/secured にアクセスすると Google のログイン画面が表示されます。ログインに成功すると、「OK」というメッセージが表示されます。

実行時に下記のプロパティを設定する必要があります。

* spring.social.google.app-id: [Cloud Console の「API とサービス」](https://console.cloud.google.com/apis/credentials)で取得したクライアントID
* spring.social.google.app-secret: 上記で取得したクライアントシークレット

また、 Cloud Console の「承認済みのリダイレクト URI」に「 http://localhost:8080/auth/google 」を追加する必要があります。

# License
CC0

http://creativecommons.org/publicdomain/zero/1.0/deed.ja
