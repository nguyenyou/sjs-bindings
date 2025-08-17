# .d.ts

```ts
export type ClassValue = ClassArray | ClassDictionary | string | number | bigint | null | boolean | undefined;
export type ClassDictionary = Record<string, any>;
export type ClassArray = ClassValue[];

export function clsx(...inputs: ClassValue[]): string;
export default clsx;

```

```scala
clsx("text-blue-500", "bg-red-500", 0, false),
clsx(
    js.Dictionary(
        "text-blue-500" -> true,
        "bg-red-500" -> false
    )
),
clsx(
    js.Array(
        "text-blue-500",
        "bg-red-500",
        0,
        false
    )
)
```