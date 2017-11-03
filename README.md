# ReadingShare
#Maple first spring boot project


#Spring boot + thymeleaf + mybatis + sqlite3
build: 
      mvn -e clean install
#Start method:
      第一种方式：Run StartApp.java main method
      第二种方式：In CMD line into project root: mvn spring-boot:run

#SQL operation:
backup:   sqlite3 dev_data.db .dump > backup.sql
recovery: sqlite3 dev_data.db < backup.sql

#Test account user:password
   student2:1234qwer
   user123: 1234qwer, 
   admin:123
   student:123
   user2:123
   
   
   
