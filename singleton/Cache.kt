/**
 * In Kotlin, the singleton pattern is used as a replacement for static members and fields that don’t exist 
 * in that programming language. A singleton is created by simply declaring an object. As follow:
 *
 * object Cache {
 *     init {
 *         println("init complete")
 *     }
 * }
 *
 * The object will be instantiated and its init blocks will be executed lazily upon first access, in a thread-safe 
 * way. To achieve this, a Kotlin object actually relies on a Java static initialization block. The above Kotlin 
 * object will be compiled to the following equivalent Java code:
 * 
 * public final class Cache {
 *     public static final Cache INSTANCE;
 *
 *     private Cache() {
 *         INSTANCE = (Cache) this;
 *         System.out.println("init complete");
 *	   }
 *	   
 *	   static {
 *	       new Cache();
 * 	   }
 * }
 */
object Cache {
    private val cache: MutableMap<String, String> = mutableMapOf()

    fun put(key: String, value: String) {
        when {
            !key.isEmpty() -> cache.put(key, value)
            else -> throw IllegalArgumentException("Key cannot be empty")
        }
    }

    fun get(key: String): String? {
        when {
            cache.containsKey(key) -> return cache.get(key)
            else -> return null
        }
    }
}
