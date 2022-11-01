package frolov.vladimir.easynotes;

import androidx.cardview.widget.CardView;

import frolov.vladimir.easynotes.models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick (Notes notes, CardView cardView);
}
