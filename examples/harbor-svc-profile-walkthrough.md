# Harbor Svc Profile Pipe Walkthrough

I use this file as a small checklist before changing the Kotlin implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 208 | ship |
| stress | retry load | 160 | ship |
| edge | worker slack | 186 | ship |
| recovery | session drift | 138 | watch |
| stale | queue pressure | 195 | ship |

Start with `baseline` and `recovery`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`baseline` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
