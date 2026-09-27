package net.shafraz.orynta

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import net.shafraz.orynta.core.designsystem.theme.OryntaTheme
import net.shafraz.orynta.core.navigation.OryntaRoute
import net.shafraz.orynta.feature.dashboard.DashboardScreen
import net.shafraz.orynta.feature.diary.DiaryScreen
import net.shafraz.orynta.feature.goals.GoalsScreen
import net.shafraz.orynta.feature.habits.HabitsScreen
import net.shafraz.orynta.feature.settings.SettingsScreen
import net.shafraz.orynta.feature.tasks.TasksScreen

@Composable
fun App() {
    OryntaTheme {
        var currentRoute by remember { mutableStateOf<OryntaRoute>(OryntaRoute.Dashboard) }

        Scaffold(
            bottomBar = {
                NavigationBar {
                    NavigationBarItem(
                        selected = currentRoute == OryntaRoute.Dashboard,
                        onClick = { currentRoute = OryntaRoute.Dashboard },
                        label = { Text("Dashboard") },
                        icon = { Text("📊") }
                    )
                    NavigationBarItem(
                        selected = currentRoute == OryntaRoute.Goals,
                        onClick = { currentRoute = OryntaRoute.Goals },
                        label = { Text("Goals") },
                        icon = { Text("🎯") }
                    )
                    NavigationBarItem(
                        selected = currentRoute == OryntaRoute.Tasks,
                        onClick = { currentRoute = OryntaRoute.Tasks },
                        label = { Text("Tasks") },
                        icon = { Text("✅") }
                    )
                    NavigationBarItem(
                        selected = currentRoute == OryntaRoute.Habits,
                        onClick = { currentRoute = OryntaRoute.Habits },
                        label = { Text("Habits") },
                        icon = { Text("🔄") }
                    )
                    NavigationBarItem(
                        selected = currentRoute == OryntaRoute.Diary,
                        onClick = { currentRoute = OryntaRoute.Diary },
                        label = { Text("Diary") },
                        icon = { Text("📖") }
                    )
                    NavigationBarItem(
                        selected = currentRoute == OryntaRoute.Settings,
                        onClick = { currentRoute = OryntaRoute.Settings },
                        label = { Text("Settings") },
                        icon = { Text("⚙️") }
                    )
                }
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                when (currentRoute) {
                    OryntaRoute.Dashboard -> DashboardScreen()
                    OryntaRoute.Goals -> GoalsScreen()
                    OryntaRoute.Tasks -> TasksScreen()
                    OryntaRoute.Habits -> HabitsScreen()
                    OryntaRoute.Diary -> DiaryScreen()
                    OryntaRoute.Settings -> SettingsScreen()
                }
            }
        }
    }
}
