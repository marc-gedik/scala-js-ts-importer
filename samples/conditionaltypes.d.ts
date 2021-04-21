
type NonNullable<T> = T extends null | undefined ? never : T;

type Unpromisify<T> = T extends Promise<infer R> ? R : T
