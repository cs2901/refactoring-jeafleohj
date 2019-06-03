boolean is_winter = date.before(SUMMER_START) || date.after(SUMMER_END):

if (is_winter) {
  charge = quantity * winterRate + winterServiceCharge;
}
else {
  charge = quantity * summerRate;
}