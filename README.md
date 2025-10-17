Демо репозиторий с Android-приложением. Показывает пример получения и отображения данных о погоде с помощью Jetpack Compose, Retrofit, Koin и Coroutines.

! Все данные о погоде в приложении генерируются вручную в коде, даже если используется API.
Проект демонстрирует архитектуру, работу с сетью и UI, а не реальное отображение прогноза.

Стек:
Kotlin, Jetpack Compose,
Koin,
Retrofit + Gson,
Coroutines

data {
  api - WeatherApi (Retrofit),
  model - Weather (data class),
  repository - WeatherRepository (возвращает тестовые данные)
}
di - AppModule (Koin),
ui - WeatherScreen (Compose UI),
viewmodel - WeatherViewModel,
App.kt - Koin,
