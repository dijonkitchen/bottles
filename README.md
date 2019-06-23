# bottles

[99 Bottles of Beer](https://en.wikipedia.org/wiki/99_Bottles_of_Beer) in Clojure.

Inspired by https://www.sandimetz.com/99bottles and https://github.com/sandimetz/99bottles


## Installation

Download from https://github.com/dijonkitchen/bottles

If you want to do the exercise yourself, you can check out the starting branch with the initial test suite: https://github.com/dijonkitchen/bottles/tree/01-starting-test-suite
## Usage

Full song:
```sh
lein run
```

### Options

A single verse:
```sh
lein run [verse-number]
```

Multiple verses:
```sh
lein run [starting-verse ending-verse]
```

### Examples

```sh
lein run 2
;; 2 bottles of beer on the wall, 2 bottles of beer.
;; Take one down and pass it around, 1 bottle of beer on the wall.
```

```sh
lein run 2 1
;; 2 bottles of beer on the wall, 2 bottles of beer.
;; Take one down and pass it around, 1 bottle of beer on the wall.
;; 1 bottle of beer on the wall, 1 bottle of beer.
;; Take it down and pass it around, no more bottles of beer on the wall.
```

## Testing

```sh
lein test
```


## Beliefs/Desires

Hoping to learn something by exercising functional programming in Clojure to figure out a tough problem in object-orieneted programming.

Wondering if it'll be any easier/simpler.


## Process

0. [Documenting hypotheses](http://tom.preston-werner.com/2010/08/23/readme-driven-development.html) (this Readme!)
0. [Design](https://www.youtube.com/watch?v=f84n5oFoZBc)
0. [Behavioral testing](https://en.wikipedia.org/wiki/Behavior-driven_development)
0. [Domain modeling](https://en.wikipedia.org/wiki/Domain-driven_design)
0. [`recur`](http://blog.cognitect.com/blog/2017/6/5/repl-debugging-no-stacktrace-required)


## Findings

First two-thirds of book seems useful and relevant to most programmers. Having a great test suite that you can lean on while refactoring is essential to slowly evolving your code. The care taken to explicitly edit one line at a time is an important one, particularly for a real-world, larger problem.

The latter third seemed less relevant for functional programmers (FP) and in particular Clojure users. With FP, you get a lot of the simplicity and performance since most everything is a pure function. Additionally, with Clojure's built-in persistent, immutable data structures, garbage collection is very efficient and object instantiation and memory allocation are not relevant. There doesn't need to be a tradeoff of understanding different objects passing messages and performance with mutable state.

I think the Primative Obsession code smell isn't a bad tradeoff since you don't have the indirection of different objects/instances which are introduced by the Extract Class refactoring pattern. This may break the Law of Demeter, but you get the benefit of a huge set of functions that operate on a few useful primative data strutures.


## License

Copyright © 2019 Jonathan Chen

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
