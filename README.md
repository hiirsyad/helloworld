# Model View Presenter
MVP atau Model View Presenter adalah pattern yang membantu kita untuk memisahkan (decouple) antara business logic (Model) dan tampilan (View) dengan menggunakan Presenter. Jadi ada 3 layer disini yaitu Model, View, dan Presenter.

View

Yang termasuk di layer ini adalah Activity, Fragment, atau View. Layer ini hanya berfungsi merespon user (misalnya klik tombol) kemudian mendelegasikan prosesnya ke Presenter.

Presenter

Presenter berada diantara View dan Model. Presenter akan bereaksi apabila ada event dari View untuk mengakses Model dan atau dari Model untuk mengubah View.

Model

Di layer ini adalah sisi business logic, termasuk request ke backend, SharedPreference / SQLite. Jadi business logic benar-benar terpisah dari tampilan (View).
