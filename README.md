# SJS Bindings

## Defining JavaScript interfaces with native JS traits

Most JavaScript APIs work with interfaces that are defined structurally. In Scala.js, the corresponding concept are `traits`. To mark a `trait` as being a representative of a JavaScript API, it must inherit directly or indirectly from `js.Any` (usually from `js.Object`).

JS traits can be native or not. The present page describes native JS traits, which must be annotated with `@js.native`. There are also non-native JS traits (aka Scala.js-defined JS traits), documented in the Scala.js-defined JS types guide. The latter have more restrictions, but can be implemented from Scala.js code. Native JS traits as described here should only be used for interfaces that are exclusively implemented by the JavaScript library–not for interfaces/contracts meant to be implemented by the user of said library.

In native JS types, all concrete definitions must have `= js.native` as body.

Here is an example giving types to a small portion of the API of `Window` objects in browsers.