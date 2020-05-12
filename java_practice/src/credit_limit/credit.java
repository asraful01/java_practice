package credit_limit;

public class credit {
 
        private int accountNum, balanceStartOfMonth, itemsCharged, totalCredits, creditLimit, newBalance;
 
        public credit(int account, int balance, int items, int totalcred, int limit, int newBalance)
        {
            accountNum = account;
            balanceStartOfMonth = balance;
            itemsCharged = items;
            totalCredits = totalcred;
            creditLimit = limit;
            newBalance = newBalance;
        }
 
        public int setAccount(int account)
        {
            accountNum = account;
            return accountNum;
        }
 
        public int setBalance(int balance)
        {
            balanceStartOfMonth = balance;
            return balanceStartOfMonth;
        }
 
        public int setItems(int items)
        {
            itemsCharged = items;
            return itemsCharged;
        }
 
        public int setTotalCredit(int totalcred)
        {
            totalCredits = totalcred;
            return totalCredits;
        }
 
        public int setCreditLimit(int limit)
        {
            creditLimit = limit;
            return creditLimit;
        }
 
 
        public int setNewBalance()
        {
            newBalance = newBalance;
 
            newBalance = balanceStartOfMonth + itemsCharged - totalCredits;
 
            return newBalance;
        }   
    }