program SoftwareEng
courses {
  course ECSE250
    credits 3
    offered FALL
    year 1

  course COMP251
    credits 4
    offered WINTER
    year 1

  course ECSE223
    credits 3
    offered BOTH
    year 1
    prereq ECSE250

  course ECSE326
    credits 4
    offered FALL
    year 2
    prereq ECSE223

  course ECSE439
    credits 3
    offered WINTER
    year 2
    prereq COMP251
    coreq ECSE326

  course ECSE539
    credits 3
    offered BOTH
    year 3
    prereq ECSE326 OR ECSE439
}
students {
  student Alice
    taken { ECSE250 }
    maxCreditsPerTerm 12

  student Bob
    taken { }
    maxCreditsPerTerm 16

  student Carol
    taken { ECSE250 COMP251 }
    maxCreditsPerTerm 14
}

