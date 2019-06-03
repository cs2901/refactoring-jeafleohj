double disabilityAmount() {
    boolean abilityAmont = seniority < 2 || monthsDisabled > 12 || isPartTime;
  if (abilityAmont) {
    return 0;
  }
  // Compute the disability amount.
  // ...
}