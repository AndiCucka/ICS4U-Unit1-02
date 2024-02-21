/*
 * This is a program that calculates the area of a circle.
 *
 * @author  Andi Cucka
 * @version 1.0
 * @since   2024-02-20
 */

import { createPrompt } from 'bun-promptx'

// input
const massOfObjectString = createPrompt("Enter the mass of an object: ")

// error checking
const massOfObject = parseFloat(massOfObjectString.value || "-1")
if (isNaN(massOfObject) == true || massOfObject < 0) {
  console.log("Invalid input.")
} else {
  // process
  const Energy = massOfObject * Math.pow(299 792 458, 2)
  // output
  console.log(`An object with a mass of ${massOfObject}kg would produce ${Energy.toFixed(3)}J.`)
}

console.log("\nDone.")
