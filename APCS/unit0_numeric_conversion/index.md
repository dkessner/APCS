# Unit 0: Numeric Conversion

## Counting in binary

* decimal
* binary
* hexadecimal
* octal

![](0.jpg)
![](1.jpg)
![](2.jpg)


## Notes (exploratory)

Decimal is base 10.  The digit positions correspond to powers of 10.

$$

\begin{aligned}
     1234_\text{DEC} &= \underset{10^3}{\fbox{ 1 }} \underset{10^2}{\fbox{ 2 }} \underset{10^1}{\fbox{ 3 }} \underset{10^0}{\fbox{ 4 }} \\
     &= 1 \cdot 10^3 + 2 \cdot 10^2 + 3 \cdot 10^1 + 4 \cdot 10^0 \\
     &= 1000 + 200 + 3 + 4
\end{aligned}
$$


Hexadecimal (hex) is base 16.  In hexadecimal we have 16 symbols: the 10
decimal symbols (0-9) and 6 letters (A-F).  

$$
\begin{array}{|c|c|}
    \hline 
    \text{decimal} & \text{hexadecimal} \\
    \hline 
    0 & 0 \\
    1 & 1 \\
    2 & 2 \\
    3 & 3 \\
    4 & 4 \\
    5 & 5 \\
    6 & 6 \\
    7 & 7 \\
    8 & 8 \\
    9 & 9 \\
    10 & A \\
    11 & B \\
    12 & C \\
    13 & D \\
    14 & E \\
    15 & F \\
    \hline 
\end{array}
$$

The digit positions correspond to powers of 16.  In code, we write hex numbers
with the prefix `0x`.  Here are some examples:

$$
\begin{aligned}
     \text{0x10} &=  \underset{16^1}{\fbox{ 1 }} \underset{16^0}{\fbox{ 0 }} \\
      &= 1 \cdot 16^1 + 0 \cdot 16^0  \\
      &= 1 \cdot 16 + 0 \cdot 1  \\
      &= 16_\text{DEC}
\end{aligned}
$$

$$
\begin{aligned}
     \text{0xA2} &=  \underset{16^1}{\fbox{ A }} \underset{16^0}{\fbox{ 2 }} \\
      &= 10 \cdot 16^1 + 2 \cdot 16^0  \\
      &= 10 \cdot 16 + 2 \cdot 1  \\
      &= 162_\text{DEC}
\end{aligned}
$$

$$
\begin{aligned}
     \text{0x29A} &=  \underset{16^2}{\fbox{ 2 }} \underset{16^1}{\fbox{ 9 }} \underset{16^0}{\fbox{ A }} \\
      &= 2 \cdot 16^2 + 9 \cdot 16^1 + A \cdot 16^0  \\
      &= 2 \cdot 256 + 9 \cdot 16 + 10 \cdot 1 \\
      &= 666_\text{DEC}
\end{aligned}
$$


