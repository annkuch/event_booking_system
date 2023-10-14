UPDATE events
SET event_name = performers.performer_name, event_description = performers.performer_description
from performers
where events.performer_id = performers.id;
