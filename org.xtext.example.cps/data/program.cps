program "Software Engineering" {

  courses {
    course ECSE200 "Introduction to Electrical Engineering" credits 3 year 1 term FALL
    course ECSE202 "Foundations of Programming"            credits 3 year 1 term WINTER
    course COMP202 "Foundations of Programming"            credits 3 year 1 term WINTER
    course ECSE205 "Intro to Signals"                      credits 3 year 1 term BOTH

    course ECSE211 "Design Principles"                     credits 3 year 2 term FALL
      prereq: (ECSE200 OR ECSE205)

    course ECSE222 "Digital Logic"                         credits 3 year 2 term WINTER
      prereq: ECSE200

    course ECSE223 "Model-Based Programming"               credits 3 year 2 term FALL
      prereq: (ECSE202 OR COMP202)
      coreq:  ECSE211

    course ECSE321 "Intro to Software Engineering"         credits 3 year 3 term WINTER
      prereq: (ECSE223 AND ECSE222)
  }

  students {
    student "Alice" maxCredits 6 {
      taken: ECSE200, ECSE202
    }

    student "Bob" maxCredits 9 {
      taken: ECSE200, COMP202, ECSE205
    }
  }
}
