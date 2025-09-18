package pawanroy.leetcode.`3408-design-task-manager`

import java.util.PriorityQueue

class TaskManager(tasks: List<List<Int>>) {

    internal data class Task(val userId: Int, val taskId: Int, var priority: Int)

    private val comparator = compareByDescending<Task> { it.priority }.thenByDescending { it.taskId }

    private val taskQueue = PriorityQueue(comparator)
    private val taskMap: MutableMap<Int, Task> = HashMap()

    init {
        tasks.forEach { task ->
            val newTask = Task(task[0], task[1], task[2])
            taskQueue.add(newTask)
            taskMap[task[1]] = newTask
        }
    }

    fun add(userId: Int, taskId: Int, priority: Int) {
        val newTask = Task(userId, taskId, priority)
        taskQueue.add(newTask)
        taskMap[taskId] = newTask
    }

    fun edit(taskId: Int, newPriority: Int) {
        val task = taskMap[taskId]
        taskQueue.remove(task)
        task!!.priority = newPriority
        taskQueue.add(task)
    }

    fun rmv(taskId: Int) {
        val task = taskMap[taskId]
        taskQueue.remove(task)
    }

    fun execTop(): Int {
        while (taskQueue.isNotEmpty()) {
            val task = taskQueue.poll()
            if (taskMap[task.taskId] === task) {
                taskMap.remove(task.taskId)
                return task.userId
            }
        }
        return -1
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * var obj = TaskManager(tasks)
 * obj.add(userId,taskId,priority)
 * obj.edit(taskId,newPriority)
 * obj.rmv(taskId)
 * var param_4 = obj.execTop()
 */