## Multithreading in JAVA

1. Create a class and extends Thread class and override run, you can call object.start()
2. Implement Runnable -> implement run, create thread, then start.
3. NEW -> RUNNABLE  -> BLOCKED/TIMED WAITING -> TERMINATED
4. Thread methods -> run, start, join, setPriority, interrupt, yield, 
5. User thread, Demon threads (Background)
6. Synchronization -> synchronized, critical section
7. Mutual Exclusion -> 
8. Locks -> Intrinsic, Explicit -> No control on locks via synchronized
9. ReentrantLock, tryLock, tryLock(timeout), finally -> lock.unlock(), Thread.currentThread.interrupt(), lock.interruptability
10. Lock Fairness -> Reentraint(true), handles Starvation
11. Read/Write Lock -> ReadWriteLock -> ReentrantReadWriteLock
12. DeadLock -> MutualExclusion, Hold and wait, No Preemption, Circular Wait
13. Thread Communication -> wait(), notify(), notifyAll()
14. Thread Safety
15. Lambda Expressions
16. Thread Pool -> resource management overhead, response time, limit on number of threads, Scalability, Thread reuse, error handling, cachedThreadPool
17. Executor Framework
    18. Executors ExecutorService-> fixedThreadPool, submit, shutdown, awaitTermination, runnable, callable, invokeAll -> blocks main thread
    19. Future -> get, isDone, cancel, isCancelled
    20. ScheduledExecutorService -> delay, or cron, sheduledAtFixedRate, shedule, scheduleAtFixedDelay




## Concurrency Management in Java

This module is to understand concurrency management in Java.

1. Database transaction with row level locking (Pessimistic Locking) - DB Level
2. Optimistic Locking with version field. - DB Level
3. Distributed Locking (Pessimistic in Nature) - Application Level

Pessimistic: Assumes conflicts are likely and locks resources before modifying them

Optimistic: Assumes that the conflicts are rare and checks for conflicts at commit time.


### Database transaction with row level locking (Pessimistic Locking) - DB Level
- Use database transaction with high isolation level
- Acquire exclusive locks on wallet rows using SELECT FOR UPDATE
- Locks are held until transaction commits/rolls back

1. BEGIN TRANSACTION
2. SELECT balance FROM wallet WHERE id = 1 FOR UPDATE (locks row)
3. SELECT balance FROM wallet WHERE id = 2 FOR UPDATE (locks row)
4. Validate
5. UPDATE row with id 1
6. UPDATE row with id 2
7. COMMIT TRANSACTION

#### Benefits
- Database ensures ATOMICITY
- Prevents concurrent modifications
- Language Independent
- Works with multiple DBs.

#### Limitations
- Locks held for entire transaction duration
- Can cause deadlocks
- May reduce throughputs under high concurrency


### Optimistic locking with version field - DB Level
- Add version/timestamp field to Wallet entity
- Read wallet with current version
- Before update, verify version hasn't changed
- If version changed, transaction fails (retry or reject)

1. Read wallet (id, balance, version)

#### Benefits
- No long-held locks
- Better for high-read
- Language Independent
- Retry mechanism handles conflicts

#### Limitations
- Requires retry logic
- Can fail multiple times
- More complex error handling

### Distributed locking - Application Level
- Use distributed lock manager (Redis, memcached ...)
- Acquire lock on walled ID before transaction
- Release lock after transaction completes
- Set lock expiration to prevent deadlocks

1. Acquire lock wallet (id, timeout)
2. READ wallet balance
3. Validate
4. Update wallet balances
5. CREATE transaction record
6. RELEASE LOCK

#### Benefits
- Works in Distributed Systems
- Language & Database Independent
- Prevent concurrent access
- Can handle high level of concurrency

#### Limitations
- Requires external locks service logic
- Network latency
- Need to handle lock expiration and renewal