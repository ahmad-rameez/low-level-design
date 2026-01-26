## ATM MACHINE

### Requirements
1. Each user has one bank account at the bank
2. User should be able to insert card and perform transactions
3. ATM should authenticate user by ATM PIN - card insertion
4. Once Authenticated user should be able to perform following
   5. view balance
   6. deposit cash
   7. withdraw cash
8. User can perform only one transaction at any given time.
9. At the end of a transaction, appropriate success/failure messages should be displayed.
10. Card Return
11. Admin can refill cash, audit inventory, take ATM in/out of service, and view logs.

### Edge Cases
1. Wrong PIN Attempts? - Limit to 3
2. ATM Withdrawal Limits? - atmCash, bankLimit
3. ATM maintains consistency?
4. Power Failures
5. Notes mismatch? - validation
6. Handling Floating point errors

### Core Entities
1. ATM 
2. Card
3. Session
4. Account
5. Transactions
6. CashDrawer
7. Denomination
8. TransactionType
9. TransactionStatus
10. Admin

### APIs
1. Card -> Insert, Eject, Authenticate
2. Session -> Start, end
3. Transaction -> view Balance, withdraw balance, deposit cash, acknowledge transaction
4. ATM -> take offline, online, audit cash
5. Admin -> Login admin, refill cash

### Controller
1. ATM Controller
2. Card Controller
3. Session Controller
4. Transaction Controller
5. Admin Controller


### State Pattern
1. void insertCard
2. void ejectCard
3. void enterPin
4. void selectTransaction
5. void processTransaction
6. void endSession
7. next