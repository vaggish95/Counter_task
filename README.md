# Counter_task
Техническое задание для собесдеования: 

Напишите на языке Java метод класса Tournament, который посчитает сколько нужно провести игр в турнире для заданного количества команд.

class Tournament {
    public int numberOfGames(int x) {
		
    }
}

Где x — количество команд в турнире.

Правила проведения турнира:
 - Если количество команд чётное, то команды распределяются по парам. Всего сыграно x / 2 игр, и x / 2 команд проходят в следующий раунд.
 - Если количество команд нечётное, то одна команда случайным образом продвигается в турнире, а остальные распределяются по парам. Всего сыграно (x - 1) / 2 игр, и (x - 1) / 2 + 1 команды проходят в следующий раунд.

Метод должен вернуть количество игр, необходимое для определения победителя.

Пример 1
Дано: x = 7
Турнирная сетка: 
- 1-й раунд: команд = 7, игр = 3, в следующий раунд выходят 4 команды.
- 2-й раунд: команд = 4, игр = 2, в следующий раунд выходят 2 команды.
- 3-й раунд: команд = 2, игр = 1, 1 команда объявляется победителем.
Всего проведено игр = 3 + 2 + 1 = 6.

Пример 2
Дано: x = 14
Турнирная сетка: 
- 1-й раунд: команд = 14, игр = 7, в следующий раунд выходят 7 команд.
- 2-й раунд: команд = 7, игр = 3, в следующий раунд выходят 4 команды.
- 3-й раунд: команд = 4, игр = 2, в следующий раунд выходят 2 команды.
- 4-й раунд: команд = 2, игр = 1, 1 команда объявляется победителем.
Всего проведено игр = 7 + 3 + 2 + 1 = 13.

Принятые ограничения:
1 <= x <= 100
