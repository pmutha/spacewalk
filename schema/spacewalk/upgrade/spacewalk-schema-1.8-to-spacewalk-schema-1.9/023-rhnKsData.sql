alter table rhnksdata add update_type varchar(7) not null default 'none';
alter table rhnksdata add constraint rhn_ks_update_type check (update_type in ('all', 'red_hat', 'none'));