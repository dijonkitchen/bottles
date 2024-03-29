(ns bottles.core-test
  (:require
   [clojure.test :refer [deftest
                         testing
                         is]]
   [bottles.core :as sut]))

(deftest bottles-test
  (testing "the first verse"
    (let [expected "99 bottles of beer on the wall, 99 bottles of beer.
Take one down and pass it around, 98 bottles of beer on the wall."]
      (is (= expected (sut/verse 99)))))

  (testing "another verse"
    (let [expected "3 bottles of beer on the wall, 3 bottles of beer.
Take one down and pass it around, 2 bottles of beer on the wall."]
      (is (= expected (sut/verse 3)))))

  (testing "verse 49"
    (let [expected "49 bottles of beer on the wall, 49 bottles of beer.
Take one down and pass it around, 2 cases of beer on the wall."]
      (is (= expected (sut/verse 49)))))

  (testing "verse 25"
    (let [expected "25 bottles of beer on the wall, 25 bottles of beer.
Take one down and pass it around, 1 case of beer on the wall."]
      (is (= expected (sut/verse 25)))))

  (testing "verse 13"
    (let [expected "13 bottles of beer on the wall, 13 bottles of beer.
Take one down and pass it around, 2 six-packs of beer on the wall."]
      (is (= expected (sut/verse 13)))))

  (testing "verse 12"
    (let [expected "2 six-packs of beer on the wall, 2 six-packs of beer.
Take one down and pass it around, 11 bottles of beer on the wall."]
      (is (= expected (sut/verse 12)))))

  (testing "verse 7"
    (let [expected "7 bottles of beer on the wall, 7 bottles of beer.
Take one down and pass it around, 1 six-pack of beer on the wall."]
      (is (= expected (sut/verse 7)))))

  (testing "verse 6"
    (let [expected "1 six-pack of beer on the wall, 1 six-pack of beer.
Take one down and pass it around, 5 bottles of beer on the wall."]
      (is (= expected (sut/verse 6)))))

  (testing "verse 2"
    (let [expected "2 bottles of beer on the wall, 2 bottles of beer.
Take one down and pass it around, 1 bottle of beer on the wall."]
      (is (= expected (sut/verse 2)))))

  (testing "verse 1"
    (let [expected "1 bottle of beer on the wall, 1 bottle of beer.
Take it down and pass it around, no more bottles of beer on the wall."]
      (is (= expected (sut/verse 1)))))

  (testing "verse 0"
    (let [expected "No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall."]
      (is (= expected (sut/verse 0)))))

  (testing "a couple verses"
    (let [expected "99 bottles of beer on the wall, 99 bottles of beer.
Take one down and pass it around, 98 bottles of beer on the wall.
98 bottles of beer on the wall, 98 bottles of beer.
Take one down and pass it around, 97 bottles of beer on the wall."]
      (is (= expected (sut/verses 99 98)))))

  (testing "a few verses"
    (let [expected "2 bottles of beer on the wall, 2 bottles of beer.
Take one down and pass it around, 1 bottle of beer on the wall.
1 bottle of beer on the wall, 1 bottle of beer.
Take it down and pass it around, no more bottles of beer on the wall.
No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall."]
      (is (= expected (sut/verses 2 0)))))

  (testing "the whole thing"
    (let [expected "99 bottles of beer on the wall, 99 bottles of beer.
Take one down and pass it around, 98 bottles of beer on the wall.
98 bottles of beer on the wall, 98 bottles of beer.
Take one down and pass it around, 97 bottles of beer on the wall.
97 bottles of beer on the wall, 97 bottles of beer.
Take one down and pass it around, 4 cases of beer on the wall.
4 cases of beer on the wall, 4 cases of beer.
Take one down and pass it around, 95 bottles of beer on the wall.
95 bottles of beer on the wall, 95 bottles of beer.
Take one down and pass it around, 94 bottles of beer on the wall.
94 bottles of beer on the wall, 94 bottles of beer.
Take one down and pass it around, 93 bottles of beer on the wall.
93 bottles of beer on the wall, 93 bottles of beer.
Take one down and pass it around, 92 bottles of beer on the wall.
92 bottles of beer on the wall, 92 bottles of beer.
Take one down and pass it around, 91 bottles of beer on the wall.
91 bottles of beer on the wall, 91 bottles of beer.
Take one down and pass it around, 15 six-packs of beer on the wall.
15 six-packs of beer on the wall, 15 six-packs of beer.
Take one down and pass it around, 89 bottles of beer on the wall.
89 bottles of beer on the wall, 89 bottles of beer.
Take one down and pass it around, 88 bottles of beer on the wall.
88 bottles of beer on the wall, 88 bottles of beer.
Take one down and pass it around, 87 bottles of beer on the wall.
87 bottles of beer on the wall, 87 bottles of beer.
Take one down and pass it around, 86 bottles of beer on the wall.
86 bottles of beer on the wall, 86 bottles of beer.
Take one down and pass it around, 85 bottles of beer on the wall.
85 bottles of beer on the wall, 85 bottles of beer.
Take one down and pass it around, 14 six-packs of beer on the wall.
14 six-packs of beer on the wall, 14 six-packs of beer.
Take one down and pass it around, 83 bottles of beer on the wall.
83 bottles of beer on the wall, 83 bottles of beer.
Take one down and pass it around, 82 bottles of beer on the wall.
82 bottles of beer on the wall, 82 bottles of beer.
Take one down and pass it around, 81 bottles of beer on the wall.
81 bottles of beer on the wall, 81 bottles of beer.
Take one down and pass it around, 80 bottles of beer on the wall.
80 bottles of beer on the wall, 80 bottles of beer.
Take one down and pass it around, 79 bottles of beer on the wall.
79 bottles of beer on the wall, 79 bottles of beer.
Take one down and pass it around, 13 six-packs of beer on the wall.
13 six-packs of beer on the wall, 13 six-packs of beer.
Take one down and pass it around, 77 bottles of beer on the wall.
77 bottles of beer on the wall, 77 bottles of beer.
Take one down and pass it around, 76 bottles of beer on the wall.
76 bottles of beer on the wall, 76 bottles of beer.
Take one down and pass it around, 75 bottles of beer on the wall.
75 bottles of beer on the wall, 75 bottles of beer.
Take one down and pass it around, 74 bottles of beer on the wall.
74 bottles of beer on the wall, 74 bottles of beer.
Take one down and pass it around, 73 bottles of beer on the wall.
73 bottles of beer on the wall, 73 bottles of beer.
Take one down and pass it around, 3 cases of beer on the wall.
3 cases of beer on the wall, 3 cases of beer.
Take one down and pass it around, 71 bottles of beer on the wall.
71 bottles of beer on the wall, 71 bottles of beer.
Take one down and pass it around, 70 bottles of beer on the wall.
70 bottles of beer on the wall, 70 bottles of beer.
Take one down and pass it around, 69 bottles of beer on the wall.
69 bottles of beer on the wall, 69 bottles of beer.
Take one down and pass it around, 68 bottles of beer on the wall.
68 bottles of beer on the wall, 68 bottles of beer.
Take one down and pass it around, 67 bottles of beer on the wall.
67 bottles of beer on the wall, 67 bottles of beer.
Take one down and pass it around, 11 six-packs of beer on the wall.
11 six-packs of beer on the wall, 11 six-packs of beer.
Take one down and pass it around, 65 bottles of beer on the wall.
65 bottles of beer on the wall, 65 bottles of beer.
Take one down and pass it around, 64 bottles of beer on the wall.
64 bottles of beer on the wall, 64 bottles of beer.
Take one down and pass it around, 63 bottles of beer on the wall.
63 bottles of beer on the wall, 63 bottles of beer.
Take one down and pass it around, 62 bottles of beer on the wall.
62 bottles of beer on the wall, 62 bottles of beer.
Take one down and pass it around, 61 bottles of beer on the wall.
61 bottles of beer on the wall, 61 bottles of beer.
Take one down and pass it around, 10 six-packs of beer on the wall.
10 six-packs of beer on the wall, 10 six-packs of beer.
Take one down and pass it around, 59 bottles of beer on the wall.
59 bottles of beer on the wall, 59 bottles of beer.
Take one down and pass it around, 58 bottles of beer on the wall.
58 bottles of beer on the wall, 58 bottles of beer.
Take one down and pass it around, 57 bottles of beer on the wall.
57 bottles of beer on the wall, 57 bottles of beer.
Take one down and pass it around, 56 bottles of beer on the wall.
56 bottles of beer on the wall, 56 bottles of beer.
Take one down and pass it around, 55 bottles of beer on the wall.
55 bottles of beer on the wall, 55 bottles of beer.
Take one down and pass it around, 9 six-packs of beer on the wall.
9 six-packs of beer on the wall, 9 six-packs of beer.
Take one down and pass it around, 53 bottles of beer on the wall.
53 bottles of beer on the wall, 53 bottles of beer.
Take one down and pass it around, 52 bottles of beer on the wall.
52 bottles of beer on the wall, 52 bottles of beer.
Take one down and pass it around, 51 bottles of beer on the wall.
51 bottles of beer on the wall, 51 bottles of beer.
Take one down and pass it around, 50 bottles of beer on the wall.
50 bottles of beer on the wall, 50 bottles of beer.
Take one down and pass it around, 49 bottles of beer on the wall.
49 bottles of beer on the wall, 49 bottles of beer.
Take one down and pass it around, 2 cases of beer on the wall.
2 cases of beer on the wall, 2 cases of beer.
Take one down and pass it around, 47 bottles of beer on the wall.
47 bottles of beer on the wall, 47 bottles of beer.
Take one down and pass it around, 46 bottles of beer on the wall.
46 bottles of beer on the wall, 46 bottles of beer.
Take one down and pass it around, 45 bottles of beer on the wall.
45 bottles of beer on the wall, 45 bottles of beer.
Take one down and pass it around, 44 bottles of beer on the wall.
44 bottles of beer on the wall, 44 bottles of beer.
Take one down and pass it around, 43 bottles of beer on the wall.
43 bottles of beer on the wall, 43 bottles of beer.
Take one down and pass it around, 7 six-packs of beer on the wall.
7 six-packs of beer on the wall, 7 six-packs of beer.
Take one down and pass it around, 41 bottles of beer on the wall.
41 bottles of beer on the wall, 41 bottles of beer.
Take one down and pass it around, 40 bottles of beer on the wall.
40 bottles of beer on the wall, 40 bottles of beer.
Take one down and pass it around, 39 bottles of beer on the wall.
39 bottles of beer on the wall, 39 bottles of beer.
Take one down and pass it around, 38 bottles of beer on the wall.
38 bottles of beer on the wall, 38 bottles of beer.
Take one down and pass it around, 37 bottles of beer on the wall.
37 bottles of beer on the wall, 37 bottles of beer.
Take one down and pass it around, 6 six-packs of beer on the wall.
6 six-packs of beer on the wall, 6 six-packs of beer.
Take one down and pass it around, 35 bottles of beer on the wall.
35 bottles of beer on the wall, 35 bottles of beer.
Take one down and pass it around, 34 bottles of beer on the wall.
34 bottles of beer on the wall, 34 bottles of beer.
Take one down and pass it around, 33 bottles of beer on the wall.
33 bottles of beer on the wall, 33 bottles of beer.
Take one down and pass it around, 32 bottles of beer on the wall.
32 bottles of beer on the wall, 32 bottles of beer.
Take one down and pass it around, 31 bottles of beer on the wall.
31 bottles of beer on the wall, 31 bottles of beer.
Take one down and pass it around, 5 six-packs of beer on the wall.
5 six-packs of beer on the wall, 5 six-packs of beer.
Take one down and pass it around, 29 bottles of beer on the wall.
29 bottles of beer on the wall, 29 bottles of beer.
Take one down and pass it around, 28 bottles of beer on the wall.
28 bottles of beer on the wall, 28 bottles of beer.
Take one down and pass it around, 27 bottles of beer on the wall.
27 bottles of beer on the wall, 27 bottles of beer.
Take one down and pass it around, 26 bottles of beer on the wall.
26 bottles of beer on the wall, 26 bottles of beer.
Take one down and pass it around, 25 bottles of beer on the wall.
25 bottles of beer on the wall, 25 bottles of beer.
Take one down and pass it around, 1 case of beer on the wall.
1 case of beer on the wall, 1 case of beer.
Take one down and pass it around, 23 bottles of beer on the wall.
23 bottles of beer on the wall, 23 bottles of beer.
Take one down and pass it around, 22 bottles of beer on the wall.
22 bottles of beer on the wall, 22 bottles of beer.
Take one down and pass it around, 21 bottles of beer on the wall.
21 bottles of beer on the wall, 21 bottles of beer.
Take one down and pass it around, 20 bottles of beer on the wall.
20 bottles of beer on the wall, 20 bottles of beer.
Take one down and pass it around, 19 bottles of beer on the wall.
19 bottles of beer on the wall, 19 bottles of beer.
Take one down and pass it around, 3 six-packs of beer on the wall.
3 six-packs of beer on the wall, 3 six-packs of beer.
Take one down and pass it around, 17 bottles of beer on the wall.
17 bottles of beer on the wall, 17 bottles of beer.
Take one down and pass it around, 16 bottles of beer on the wall.
16 bottles of beer on the wall, 16 bottles of beer.
Take one down and pass it around, 15 bottles of beer on the wall.
15 bottles of beer on the wall, 15 bottles of beer.
Take one down and pass it around, 14 bottles of beer on the wall.
14 bottles of beer on the wall, 14 bottles of beer.
Take one down and pass it around, 13 bottles of beer on the wall.
13 bottles of beer on the wall, 13 bottles of beer.
Take one down and pass it around, 2 six-packs of beer on the wall.
2 six-packs of beer on the wall, 2 six-packs of beer.
Take one down and pass it around, 11 bottles of beer on the wall.
11 bottles of beer on the wall, 11 bottles of beer.
Take one down and pass it around, 10 bottles of beer on the wall.
10 bottles of beer on the wall, 10 bottles of beer.
Take one down and pass it around, 9 bottles of beer on the wall.
9 bottles of beer on the wall, 9 bottles of beer.
Take one down and pass it around, 8 bottles of beer on the wall.
8 bottles of beer on the wall, 8 bottles of beer.
Take one down and pass it around, 7 bottles of beer on the wall.
7 bottles of beer on the wall, 7 bottles of beer.
Take one down and pass it around, 1 six-pack of beer on the wall.
1 six-pack of beer on the wall, 1 six-pack of beer.
Take one down and pass it around, 5 bottles of beer on the wall.
5 bottles of beer on the wall, 5 bottles of beer.
Take one down and pass it around, 4 bottles of beer on the wall.
4 bottles of beer on the wall, 4 bottles of beer.
Take one down and pass it around, 3 bottles of beer on the wall.
3 bottles of beer on the wall, 3 bottles of beer.
Take one down and pass it around, 2 bottles of beer on the wall.
2 bottles of beer on the wall, 2 bottles of beer.
Take one down and pass it around, 1 bottle of beer on the wall.
1 bottle of beer on the wall, 1 bottle of beer.
Take it down and pass it around, no more bottles of beer on the wall.
No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall."]
      (is (= expected (sut/song))))))
