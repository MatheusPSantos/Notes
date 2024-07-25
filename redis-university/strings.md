Redis Strings are a safe sequence of bytes.

Strings are the simplest data type that can be associated with a key.

Maximum of 512MB for any string value.

The common usage of Redis String are:
  - caching:
    - HTML pages
    - session storages
    - API response

  - Counters

`Set` key word.

```
127.0.0.1:6379> set user:101:time-zone UTC-8
OK
```

Where `user:101:time-zone` is the **key** and `UTC-8` is the **value**.

We use `get` command to retrieve a Redis String.

#### INCR and INCRBY
Can increment a key's value by one or specified value.

```
127.0.0.1:6379> EXISTS user:23:visit-count
(integer) 0
127.0.0.1:6379> INCR user:23:visit-count
(integer) 1
127.0.0.1:6379> INCR user:23:visit-count
(integer) 2
127.0.0.1:6379> INCR user:23:visit-count
(integer) 3
127.0.0.1:6379> INCR user:23:visit-count
(integer) 4
```

Usage of **INCRBY** can increment key's value using an specified number.
```
127.0.0.1:6379> INCRBY user:23:credit-balance 20
(integer) 20
127.0.0.1:6379> INCRBY user:23:credit-balance -2
(integer) 18
127.0.0.1:6379> get user:23:credit-balance
"18"
127.0.0.1:6379> INCRBY user:23:credit-balance 23
(integer) 41
127.0.0.1:6379> get user:23:credit-balance
"41"
127.0.0.1:6379> INCR user:23:credit-balance
(integer) 42
127.0.0.1:6379> get user:23:credit-balance
"42"
```

---
### Manipulating Strings
- **DECRBY** key decrement
  - **DECR** key
- **INCRBY** key increment
  - **INCR** key
- **INCRBYFLOAT** key increment

Examples:

```
127.0.0.1:6379> set inventory:4x100m-womens-final 1000
OK
127.0.0.1:6379> get inventory:4x100m-womens-final
"1000"
127.0.0.1:6379> decrby inventory:4x100m-womens-final 1
(integer) 999
```

The value still being a string. It can be checked using `get` command.

```
127.0.0.1:6379> get inventory:4x100m-womens-final
"999"
127.0.0.1:6379> type inventory:4x100m-womens-final
string
```

We can also check the encoding of the value using `OBJECT` command.

```
127.0.0.1:6379> object encoding inventory:4x100m-womens-final
"int"
```
This is how Redis knows peforms INCR and DECR on a stored value.

`POLYMORPHISM` is the ability of Redis to represent different types of data over time for the same key.

```
127.0.0.1:6379> set inventory:4x100m-womens-final "Sould Out"
OK
127.0.0.1:6379> object encoding inventory:4x100m-womens-final
"embstr"
127.0.0.1:6379> type inventory:4x100m-womens-final
string
```

**"embstr"** represents a text value. This has consequences for developers since your code will need to be aware that the data tupe may change.

Thre is no shcmea enforcing a particular type.

