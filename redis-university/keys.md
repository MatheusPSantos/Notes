Commands
```shell```
First command are:
exists -> check if an key exists before use set. Returns 1 if exists and 0 if not.
```
EXISTS key [key ...]
```
Example:
```
127.0.0.1:6379> exists customer:1000
(integer) 0
```
set -> provide wy to store a value for a given key name.
```shell
set KEY value [EX seconds] [PX miliseconds] [NX|XX]
```
Example:
```shell
127.0.0.1:6379> set customer:1000 fred
```
---
[NX] -> ensure that can set key if another key with the same value does not exists.
Example:
```
127.0.0.1:6379> set inventory:100-meters-womens-final 1000 NX
OK
```
If try to inser another:
```
127.0.0.1:6379> set inventory:100-meters-womens-final "Sould out" NX
(nil)
```
---
[XX] -> allows set inset value for an existing key. Example:
Creating the first key and after getting present value.

```
set inventory:100-meters-womens-final 1000 NX
OK

127.0.0.1:6379> get inventory:100-meters-womens-final
"1000"
```
Using XX:
```
127.0.0.1:6379> set inventory:100-meters-womens-final 3  XX
OK
127.0.0.1:6379> get inventory:100-meters-womens-final
"3"
```
---

get -> retuns the value at the given key name.
```shell
get KEY
```
Example:
```shell
127.0.0.1:6379> get customer:1000
"fred"
```
---
There are two commands to returns existing keys names in Redis:
|keys|scan|
|-|-|
|Blocks until complete|Iterates using a cursor|
|Never use in production|Returns a slot reference|
|Useful for debugging|May returns 0 or more keys per call|
||Safe for production|

Examples:

```shell
127.0.0.1:6379> keys customer:1*
1) "customer:1000"
```
The sintax scan command is:
```
SCAN slot [MATCH pattern][COUNT count]
```

```shell
127.0.0.1:6379> scan 0 MATCH customer:1*
1) "0"
2) 1) "customer:1000"
```
When the command returns, we may or may not have matches, but there will be a new slot ID to plug into the next call.
```shell
127.0.0.1:6379> scan 1 MATCH customer:1*
1) "0"
2) (empty array)
```
---
### Removing keys
Keys can be removed in a couple of ways. Both will ensure that the key is removed, but each has a different performance profile.

```
DEL key [key ...]

UNLINK key [key ...]
```
UNLINK the key is unlinked hence the name of the command and will no longer exist.

The memory associated with the key value is reclaimed by an asynchronous process.

UNLINK is non blocking command.
```
127.0.0.1:6379> unlink customer:1000
(integer) 1
127.0.0.1:6379> get customer:1000
(nil)
```
---
### Expiration time

```
127.0.0.1:6379> set seat-holder Row:A:Seat:4 PX 50000
OK

```

The PX define that the expiration time of the key is 50 thounds milliseconds.

This can be defined as seconds using EX.
```
127.0.0.1:6379> set seat-holder Row:A:Seat:4 EX 5
OK
127.0.0.1:6379> get seat-holder
"Row:A:Seat:4"
127.0.0.1:6379> get seat-holder
"Row:A:Seat:4"
127.0.0.1:6379> get seat-holder
(nil)
127.0.0.1:6379> 
```

#### PEXPIRE
We can change expiration using `pexpire` command, like this:
```
127.0.0.1:6379> set seat-holder Row:A:Seat:4 EX 30
OK
127.0.0.1:6379> pexpire seat-holder 4
(integer) 1
127.0.0.1:6379> get seat-holder
(nil)
127.0.0.1:6379> get seat-holder
```
#### TTL

Using the `ttl` command we can inspect the current ttl - time to leave from a key.

```
127.0.0.1:6379> set seat-holder Row:A:Seat:4 EX 30
OK
127.0.0.1:6379> ttl seat-holder
(integer) 22
127.0.0.1:6379> ttl seat-holder
(integer) 18
127.0.0.1:6379> ttl seat-holder
(integer) 11
127.0.0.1:6379> ttl seat-holder
(integer) 7
127.0.0.1:6379> ttl seat-holder
(integer) 2
127.0.0.1:6379> ttl seat-holder
(integer) -2
127.0.0.1:6379> ttl seat-holder
(integer) -2
127.0.0.1:6379> get seat-holder
(nil)
```

#### PERSIST

`persist` command removes the TTL on the key to ensure the key is retained. Using `ttl` again we can see the new TTL is negative 1 indicating the key should be retained.

```
127.0.0.1:6379> set seat-holder Row:A:Seat:4 PX 20000
OK
127.0.0.1:6379> ttl seat-holder
(integer) 10
127.0.0.1:6379> persist seat-holder
(integer) 1
127.0.0.1:6379> ttl seat-holder
(integer) -1
```