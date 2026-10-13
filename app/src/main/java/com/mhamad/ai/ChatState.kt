package com.mhamad.ai

import android.graphics.Bitmap
import com.mhamad.ai.data.Chat
import com.mhamad.ai.data.ErrorInfo

/**
 * @author Nitesh
 */

enum class ApiProvider {
    OPENROUTER,
    GEMINI,
    GROQ
}

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null,
    val error: ErrorInfo? = null,
    val isGeneratingResponse: Boolean = false,
    val showPromptSuggestions: Boolean = true,
    val currentApiProvider: ApiProvider = ApiProvider.GEMINI, // Gemini as default
    // Authentication and session management
    val currentUser: com.google.firebase.auth.FirebaseUser? = null,
    val currentSessionId: String? = null,
    val chatSessions: List<com.mhamad.ai.data.ChatSession> = emptyList(),
    val isDrawerOpen: Boolean = false
)





