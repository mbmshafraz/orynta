package net.shafraz.orynta.core.navigation

sealed interface OryntaRoute {
    data object Dashboard : OryntaRoute
    data object Goals : OryntaRoute
    data object Tasks : OryntaRoute
    data object Habits : OryntaRoute
    data object Diary : OryntaRoute
    data object Settings : OryntaRoute
}
